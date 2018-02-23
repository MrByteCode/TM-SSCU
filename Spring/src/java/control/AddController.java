package control;

import model.Conection;
import model.Usuarios;
import model.UsuariosValidation;
import org.springframework.jdbc.core.JdbcTemplate;
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
    private JdbcTemplate jdbcTemplate;
    
    public AddController(){
        this.usuarioValidation=new UsuariosValidation();
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("usuario",new Usuarios());
        mav.setViewName("add");
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(
            @ModelAttribute("usuario") Usuarios u,
            BindingResult result,
            SessionStatus status){
        this.usuarioValidation.validate(u, result);
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();
            mav.setViewName("add");
            mav.addObject("usuario",new Usuarios());
            return mav;            
        }else{
            //todo OK
            this.jdbcTemplate.update("INSERT INTO usuarios (nombre,correo,telefono) VALUES (?,?,?)",u.getNombre(),u.getCorreo(),u.getTelefono());
            return new ModelAndView("redirect:/home.htm");
        }
    }
}