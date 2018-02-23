package controller;

import model.Conectar;
import model.Usuario;
import model.UsuarioValidation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="added.htm")
public class AddedController {
    UsuarioValidation usuarioValidation;
    private JdbcTemplate jdbcTemplate;
    
    public AddedController(){
        this.usuarioValidation=new UsuarioValidation();
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("usuario",new Usuario());
        mav.setViewName("added");
        return mav;
    }
        @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(
            @ModelAttribute("usuario") Usuario u,
            BindingResult result,
            SessionStatus status){
        this.usuarioValidation.validate(u, result);
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();
            mav.setViewName("added");
            mav.addObject("usuario",new Usuario());
            return mav;            
        }else{
            //todo OK
            this.jdbcTemplate.update("INSERT INTO usuarios (nombre,correo,telefono) VALUES (?,?,?)",u.getNombre(),u.getCorreo(),u.getTelefono());
            return new ModelAndView("redirect:/add.htm");
        }
    }
}
