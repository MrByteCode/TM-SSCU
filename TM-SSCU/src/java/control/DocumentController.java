package control;

import dao.DAOFileMeta;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Conection;
import model.FileMeta;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("document.htm")
public class DocumentController {
    private JdbcTemplate jdbcTemplate;
    
    public DocumentController(){
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
       
    @RequestMapping(method=RequestMethod.GET)
    public void form(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ClassNotFoundException{
        ModelAndView mav=new ModelAndView();
        int idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
        int idFile=Integer.parseInt(request.getParameter("idFile"));
        FileMeta datos=DAOFileMeta.selectFile(idFile,idUsuario);
       //String contentType = this.getServletContext().getMimeType(fileName);
       //System.out.println("Content Type: application/pdf" + contentType);
       //response.setHeader("Content-Type", contentType);
       //response.setHeader("Content-Length", String.valueOf(attachment.getFileData().length()));
       //response.setHeader("Content-Disposition", "inline; filename=\"" + attachment.getFileName() + "\"");
       // For big BLOB data.
        response.setContentType(datos.getFileType());
        System.out.println("::::::"+datos.getFileType());
        Blob fileData = datos.getDocumentoBlob();
        InputStream is = fileData.getBinaryStream();
        byte[] bytes = new byte[1024];
        int bytesRead;
        while ((bytesRead = is.read(bytes)) != -1) {        
           response.getOutputStream().write(bytes, 0, bytesRead);
        }
        is.close();
    }
    /*
    public FileMeta selectFile(int idFile, int idUsuario){
        final FileMeta fileMeta=new FileMeta();
        //OutputBlob outBlob;
        String query="SELECT file,type FROM files WHERE idFile='"+idFile+"' AND idUsuario='"+idUsuario+"'";
        return (FileMeta) jdbcTemplate.query(query, new ResultSetExtractor<FileMeta>(){
            public FileMeta extractData (ResultSet rs) throws SQLException, DataAccessException{
                while(rs.next()){
                    //FileMeta fileMeta=new FileMeta();
                    fileMeta.setDocumentoBlob(rs.getBlob("file"));
                    fileMeta.setFileType(rs.getString("type"));  
                    System.out.println("::::in"+rs.getString("type"));
                    }
                return fileMeta;
                }
            }
        );
    }*/
    
    /*
    // Download a file
    @RequestMapping(
        value = "/download",
        method = RequestMethod.GET
    )
    public ResponseEntity downloadFile(@RequestParam("filename") String filename) {

        FileUpload fileUpload = fileUploadService.findByFilename(filename);

        // No file found based on the supplied filename
        if (fileUpload == null) {
            return new ResponseEntity<>("{}", HttpStatus.NOT_FOUND);
        }

        // Generate the http headers with the file properties
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "attachment; filename=" + fileUpload.getFilename());

        // Split the mimeType into primary and sub types
        String primaryType, subType;
        try {
            primaryType = fileUpload.getMimeType().split("/")[0];
            subType = fileUpload.getMimeType().split("/")[1];
        }
            catch (IndexOutOfBoundsException | NullPointerException ex) {
            return new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        headers.setContentType( new MediaType(primaryType, subType) );

        return new ResponseEntity<>(fileUpload.getFile(), headers, HttpStatus.OK);
    }
    */
    /**
    @RequestMapping(value = { "document" }, method = RequestMethod.GET)
    public String downloadDocument(@PathVariable int userId, @PathVariable int docId, HttpServletResponse response) throws IOException {
        UserDocument document = userDocumentService.findById(docId);
        response.setContentType(document.getType());
        response.setContentLength(document.getContent().length);
        response.setHeader("Content-Disposition","attachment; filename=\"" + document.getName() +"\"");
  
        FileCopyUtils.copy(document.getContent(), response.getOutputStream());
  
        return "redirect:/add-document-"+userId;
    }     **/
/**	
	@Autowired
	private DocumentDAO documentDao;	
	@RequestMapping("/home")
	public String index(Map<String, Object> map) {
		try {
			map.put("document", new Document());
			map.put("documentList", documentDao.list());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "documents";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(
			@ModelAttribute("document") Document document,
			@RequestParam("file") MultipartFile file) {
		
		
		System.out.println("Name:" + document.getName());
		System.out.println("Desc:" + document.getDescription());
		System.out.println("File:" + file.getName());
		System.out.println("ContentType:" + file.getContentType());
		
		try {
			Blob blob = Hibernate.createBlob(file.getInputStream());

			document.setFilename(file.getOriginalFilename());
			document.setContent(blob);
			document.setContentType(file.getContentType());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			documentDao.save(document);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/index.html";
	}

	@RequestMapping("/download/{documentId}")
	public String download(@PathVariable("documentId")
			Integer documentId, HttpServletResponse response) {
		
		Document doc = documentDao.get(documentId);
		try {
			response.setHeader("Content-Disposition", "inline;filename=\"" +doc.getFilename()+ "\"");
			OutputStream out = response.getOutputStream();
			response.setContentType(doc.getContentType());
			IOUtils.copy(doc.getContent().getBinaryStream(), out);
			out.flush();
			out.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@RequestMapping("/remove/{documentId}")
	public String remove(@PathVariable("documentId")
			Integer documentId) {
		
		documentDao.remove(documentId);
		
		return "redirect:/index.html";
	}
        */
}