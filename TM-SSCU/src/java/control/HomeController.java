package control;

import DTO.DTOUsuarioFile;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conection;
import model.Usuarios;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.LlenaUsuariosService;

public class HomeController {
    private JdbcTemplate jdbcTemplate;   
    public HomeController(){
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }    
    @RequestMapping(value="home.htm")
    public ModelAndView home() throws SQLException, ClassNotFoundException{
        ModelAndView mav=new ModelAndView();
        List<DTOUsuarioFile> listUser = LlenaUsuariosService.getUsers();         
        List<Usuarios> usuariosList = new ArrayList<Usuarios>();      
        for(DTOUsuarioFile user : listUser){
            usuariosList.add(user.getUser());
        }
        mav.addObject("usuarios",usuariosList);
        return mav;        
        
//        get java.util.ConcurrentModificationException
//        mav.addObject("usuarios",LlenaUsuariosService.getUsuarios());
//        return mav;
        /*
        List datos=jdbcTemplate.queryForList("SELECT * FROM USUARIOS");
        mav.addObject("usuarios",datos);
        return mav;
        */
        /* //WORKS
        mav.addObject("usuarios",DaoUsuarios.selectUsuarios());
        model.put("usuarios", usuariosList);
        model.put("filemeta", fileMetaList);
        return new ModelAndView("home", "model", model); 
        */
        
//        Model model=null;
//        //Map<String, Object> model = new HashMap<String, Object>();
//        List<DTOUsuarioFile> listUser = LlenaUsuariosService.getUsers();         
//        List<Usuarios> usuariosList = new ArrayList<Usuarios>();      
//        List<FileMeta> fileMetaList = new ArrayList<FileMeta>();//        
//        for(DTOUsuarioFile user : listUser){
//            System.out.println(listUser.size());
//            usuariosList.add(user.getUser());
////            for(FileMeta file : user.getListFile()){                
////                fileMetaList.add(file);
////                //
////                model.addAttribute("usuarios_" +user.getUser().getIdUsuario(), file);
////            }
//        }

        
//        model.put("usuarios", usuariosList);
//        model.put("filemeta", fileMetaList);
//        return new ModelAndView("home", "model", model);          
//        mav.addObject("usuarios",usuariosList);
//        mav.addObject("file",fileMetaList);
//        return mav;        
//        
        
//        List<DTOUsuarioFile> listUser = LlenaUsuariosService.getUsers();         
//        List<Usuarios> usuariosList = new ArrayList<Usuarios>();      
//        List<FileMeta> fileMetaList = new ArrayList<FileMeta>();//                           
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("usuarios", usuariosList);
//        model.put("filemeta", fileMetaList);
//        return new ModelAndView("home", "model", model);        
        
//        return mav;
//        int id=Integer.parseInt(request.getParameter("idUsuario"));
//        Usuarios datosUsuarioFile=this.selectUsuario(new Integer(85));
//        for(FileMeta c: _costs) {
//            model.addAttribute("usuario_" + datosUsuarioFile.getId(), c);
//        }
        /*
        <c:forEach items="${costs}" var="cost">
        <form:form commandName="cost_${cost.id}" method="POST"  action="save_vehicle_cost" cssClass="form-horizontal" role="form">
            ...
            ...
        </c:forEach>
        */
//        mav.addObject("usuarios",new Usuarios(datosUsuarioFile.getId(),datosUsuarioFile.getFileMetaList()));          
//        mav.setViewName("home");  
//        List<Usuarios> usuariosList = jdbcTemplate.queryForList(sql);
//        List<FileMeta> departmentList = new ArrayList<FileMeta>();
//        for (Usuarios e : usuariosList) {
//            departmentList.add(departmentService.getDepartment(e.getDept_id()));
//        }
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("employee", employeeList);
//        model.put("department", departmentList);
//        new ModelAndView("viewEmployee", "model", model);        
//        return new ModelAndView("home", "usuarios", LlenaUsuariosService.getUsers());        
//        return mav;
    }   
}