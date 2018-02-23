package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import model.Conection;
import model.Usuarios;
import model.UsuariosValidation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="add.htm")
public class AddController {
    UsuariosValidation usuarioValidation;        
    public AddController(){
        usuarioValidation=new UsuariosValidation();
    }
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("usuario",new Usuarios());
        mav.setViewName("add");
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(@ModelAttribute("usuario") Usuarios u,BindingResult result,SessionStatus status,HttpServletRequest req) 
            //@RequestParam("fileselects[]") MultipartFile[] files
            throws FileNotFoundException, SQLException, ClassNotFoundException, IOException, ServletException{
        usuarioValidation.validate(u, result);        
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();
            mav.setViewName("add");
            mav.addObject("usuario",new Usuarios());
            return mav;            
        }else{
            PreparedStatement ps=null;
            ResultSet rs;
            Connection con=Conection.createConectionPS();                        
            ps=con.prepareStatement("SELECT * FROM USUARIOS WHERE CORREO='"+u.getCorreo()+"'"); 
            ps.executeQuery();
            rs=ps.getResultSet();                
            if(!rs.next()){
                ps=con.prepareStatement("INSERT INTO usuarios (nombre,correo,telefono,fechaAlta) VALUES (?,?,?,?)"); 
                ps.setString(1,u.getNombre());
                ps.setString(2,u.getCorreo());
                ps.setString(3,u.getTelefono());
                ps.setDate(4,new java.sql.Date(new java.util.Date().getTime()));
                ps.executeUpdate();
            }
            InputStream is=null;
            ps=con.prepareStatement("INSERT INTO files (name,size,type,file) VALUES (?,?,?,?)"); 
            for (Part part : req.getParts()) {                
                System.out.println(":::::"+part.getName()+"::::");
                System.out.println(new Date().toString()+"\n"+part.getContentType()+"\n"+part.getName()+"\n"+part.getSubmittedFileName()+"\n"+part.getSize()/1024+" Kb"+"\n");
                if(part.getContentType()!=null){
                    is = part.getInputStream();  
                    System.out.println(new Date().toString()+"\n"+part.getContentType());
                    ps.setString(1,part.getSubmittedFileName());
                    ps.setString(2,""+part.getSize()/1024+" Kb");
                    ps.setString(3,""+part.getContentType());                        
                    ps.setBlob(4, is);
                    ps.executeUpdate();
                    ps=con.prepareStatement("INSERT INTO user2file (idUsuario,idFile) VALUES ((SELECT IDUSUARIO FROM USUARIOS ORDER BY IDUSUARIO DESC LIMIT 1),(SELECT IDFILE FROM FILES ORDER BY IDFILE DESC LIMIT 1))");
                    ps.executeUpdate();                    
                }
            }
            ps.close();
            con.close(); 
            return new ModelAndView("redirect:/home.htm");
        }                
    }               
//    LinkedList<FileMeta> files = new LinkedList<FileMeta>();
//    FileMeta fileMeta = null;
//   
    /***************************************************
     * URL: /rest/controller/upload  
     * upload(): receives files
     * @param request : MultipartHttpServletRequest auto passed
     * @param response : HttpServletResponse auto passed
     * @return LinkedList<FileMeta> as json format
     ****************************************************/
     /*
    @RequestMapping(value="/upload", method = RequestMethod.POST)
    public @ResponseBody LinkedList<FileMeta> upload(MultipartHttpServletRequest request, HttpServletResponse response) {
        //1. build an iterator
         Iterator<String> itr =  request.getFileNames();
         MultipartFile mpf = null;
         //2. get each file
         while(itr.hasNext()){
             //2.1 get next MultipartFile
             mpf = request.getFile(itr.next()); 
             System.out.println(mpf.getOriginalFilename() +" uploaded! "+files.size());
             //2.2 if files > 10 remove the first from the list
             if(files.size() >= 10)
                 files.pop();
             //2.3 create new fileMeta
             fileMeta = new FileMeta();
             fileMeta.setFileName(mpf.getOriginalFilename());
             fileMeta.setFileSize(mpf.getSize()/1024+" Kb");
             fileMeta.setFileType(mpf.getContentType());
             try {
                fileMeta.setBytes(mpf.getBytes());
                 // copy file to local disk (make sure the path "e.g. D:/temp/files" exists)            
                 FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream("D:/tmp/"+mpf.getOriginalFilename()));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             //2.4 add to files
             files.add(fileMeta);
         }
        // result will be like this
        // [{"fileName":"app_engine-85x77.png","fileSize":"8 Kb","fileType":"image/png"},...]
        return files;
    }
    */
    /***************************************************
     * URL: /rest/controller/get/{value}
     * get(): get file as an attachment
     * @param response : passed by the server
     * @param value : value from the URL
     * @return void
     ****************************************************/
    /*
    @RequestMapping(value = "/get/{value}", method = RequestMethod.GET)
     public void get(HttpServletResponse response,@PathVariable String value){
         FileMeta getFile = files.get(Integer.parseInt(value));
         try {      
                response.setContentType(getFile.getFileType());
                response.setHeader("Content-disposition", "attachment; filename=\""+getFile.getFileName()+"\"");
                FileCopyUtils.copy(getFile.getBytes(), response.getOutputStream());
         }catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
         }
     }*/    
}