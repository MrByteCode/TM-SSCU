package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Usuario;
import model.UsuarioValidation;
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
@RequestMapping(value="added.htm")
public class EditController {
    UsuarioValidation usuarioValidation;
    private JdbcTemplate jdbcTemplate;
    
    public EditController(){
        this.usuarioValidation=new UsuarioValidation();
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        int id=Integer.parseInt(request.getParameter("id"));
        Usuario datos=this.selectUsuario(id);
        mav.setViewName("edit");
        mav.addObject("usuario",new Usuario(id,datos.getNombre(),datos.getCorreo(),datos.getTelefono()));        
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(
            @ModelAttribute("usuario") Usuario u,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest request){        
        this.usuarioValidation.validate(u, result);
        int id=Integer.parseInt(request.getParameter("id"));
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();            
            Usuario datos=this.selectUsuario(id);
            mav.setViewName("edit");
            mav.addObject("usuario",new Usuario(id,datos.getNombre(),datos.getCorreo(),datos.getTelefono()));
            return mav;
        }else{
            //todo OK
            this.jdbcTemplate.update("UPDATE usuarios "
                    + "SET nombre=?, "
                    + "correo=?, "
                    + "telefono=? "
                    + "WHERE id=? ",
                    u.getNombre(),u.getCorreo(),u.getTelefono(),id);
            return new ModelAndView("redirect:/add.htm");
        }
    }
    public Usuario selectUsuario(int id){
        final Usuario usuario=new Usuario();
        String query="SELECT * FROM usuarios WHERE id='"+id+"'";
        return (Usuario) jdbcTemplate.query(query, new ResultSetExtractor<Usuario>(){
            public Usuario extractData (ResultSet rs) throws SQLException, DataAccessException{
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