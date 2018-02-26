package control;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Conection;
import model.Usuarios;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
    public void form(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
        ModelAndView mav=new ModelAndView();
        int id=Integer.parseInt(request.getParameter("id"));
        Usuarios datos=selectUsuario(id);
       //String contentType = this.getServletContext().getMimeType(fileName);
       //System.out.println("Content Type: application/pdf" + contentType);
       //response.setHeader("Content-Type", contentType);
       //response.setHeader("Content-Length", String.valueOf(attachment.getFileData().length()));
       //response.setHeader("Content-Disposition", "inline; filename=\"" + attachment.getFileName() + "\"");

       // For big BLOB data.
        response.setContentType("application/pdf");
        Blob fileData = datos.getDocumentoBlob();
        InputStream is = fileData.getBinaryStream();
        byte[] bytes = new byte[1024];
        int bytesRead;
        while ((bytesRead = is.read(bytes)) != -1) {        
           response.getOutputStream().write(bytes, 0, bytesRead);
        }
        is.close();
    }
    
    public Usuarios selectUsuario(int id){
        final Usuarios usuarios=new Usuarios();
        //OutputBlob outBlob;
        String query="SELECT file FROM usuarios WHERE id='"+id+"'";
        return (Usuarios) jdbcTemplate.query(query, new ResultSetExtractor<Usuarios>(){
            public Usuarios extractData (ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    usuarios.setDocumento(rs.getBlob("file"));
                    }
                return usuarios;
                }
            }
        );
    }    
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