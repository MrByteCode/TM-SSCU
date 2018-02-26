package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conection;
import model.Usuarios;
import model.UsuariosValidation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="edit.htm")
public class EditController {
    UsuariosValidation usuarioValidation;
    private JdbcTemplate jdbcTemplate;
    
    public EditController(){
        this.usuarioValidation=new UsuariosValidation();
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        int id=Integer.parseInt(request.getParameter("idUsuario"));
        Usuarios datos=selectUsuario(id);
        mav.setViewName("edit");
        mav.addObject("usuario",new Usuarios(id,datos.getNombre(),datos.getCorreo(),datos.getTelefono(),datos.getFileMetaList()));        
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(
            @ModelAttribute("usuario") Usuarios u,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest request){        
        this.usuarioValidation.validate(u, result);
        int id=Integer.parseInt(request.getParameter("idUsuario"));
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();            
            Usuarios datos=this.selectUsuario(id);
            mav.setViewName("edit");
            mav.addObject("usuario",new Usuarios(id,datos.getNombre(),datos.getCorreo(),datos.getTelefono(),datos.getFileMetaList()));
            return mav;
        }else{
            //todo OK
            this.jdbcTemplate.update("UPDATE usuarios "
                    + "SET nombre=?, "
                    + "correo=?, "
                    + "telefono=? "
                    + "WHERE idUsuario=? ",
                    u.getNombre(),u.getCorreo(),u.getTelefono(),id);
            return new ModelAndView("redirect:/home.htm");
        }
    }
    public Usuarios selectUsuario(int id){
        final Usuarios usuario=new Usuarios();
        String query="SELECT * FROM usuarios WHERE idUsuario='"+id+"'";
        return (Usuarios) jdbcTemplate.query(query, new ResultSetExtractor<Usuarios>(){
            public Usuarios extractData (ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    usuario.setNombre(rs.getString("nombre"));
                    usuario.setCorreo(rs.getString("correo"));
                    usuario.setTelefono(rs.getString("telefono"));
                    
                }
                return usuario;
                }
            }
        );
    }
}