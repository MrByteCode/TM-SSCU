package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.Conection;
import model.FileMeta;
import model.Usuarios;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
    private JdbcTemplate jdbcTemplate;   
    public HomeController(){
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }    
    @RequestMapping(value="home.htm")
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView();
        String sql="SELECT * FROM USUARIOS";
        List datos=jdbcTemplate.queryForList(sql);        
        mav.addObject("datos",datos);
        
//        int id=Integer.parseInt(request.getParameter("idUsuario"));
        Usuarios datosUsuarioFile=this.selectUsuario(new Integer(85));
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
        mav.addObject("usuarios",new Usuarios(datosUsuarioFile.getId(),datosUsuarioFile.getFileMetaList()));          
        mav.setViewName("home");  
//        
//        List<Usuarios> usuariosList = jdbcTemplate.queryForList(sql);
//        
//        List<FileMeta> departmentList = new ArrayList<FileMeta>();
//        for (Usuarios e : usuariosList) {
//            departmentList.add(departmentService.getDepartment(e.getDept_id()));
//        }
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("employee", employeeList);
//        model.put("department", departmentList);
//        new ModelAndView("viewEmployee", "model", model);        
//        return new ModelAndView("viewEmployee", "model", model);        
        return mav;
    }
    public Usuarios selectUsuario(int id){
        final Usuarios usuario=new Usuarios();
        final FileMeta fileMeta=new FileMeta();
        String query="SELECT * FROM USUARIOS u inner join USER2FILE uf on uf.idUsuario=u.idUsuario INNER JOIN files f on f.idFile= uf.idFile WHERE u.idUsuario='"+id+"'";
        List<FileMeta> fileMetaList=new ArrayList<FileMeta>();
        return (Usuarios) jdbcTemplate.query(query, new ResultSetExtractor<Usuarios>(){
            public Usuarios extractData (ResultSet rs) throws SQLException, DataAccessException{
                int i=1;
                
                while(rs.next()){
                    usuario.setNombre(rs.getString("nombre"));
                    usuario.setCorreo(rs.getString("correo"));
                    usuario.setTelefono(rs.getString("telefono"));
                    fileMeta.setFileName(rs.getString("name"));
                    fileMeta.setFileSize(rs.getString("size"));
                    fileMeta.setFileType(rs.getString("type"));
                    //Object fileMetaObject = rs.getogetObject(i); 
                    //FileMeta fileMeta = (FileMeta)fileMetaObject;
                    fileMetaList.add(fileMeta);
                    //fileMeta=null;
                    i++;                    
                }
                usuario.setFileMetaList(fileMetaList);
                return usuario;
                }
            }
        );        
    }    
}