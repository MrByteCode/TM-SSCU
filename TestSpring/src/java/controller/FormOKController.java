package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import model.PersonaOK;
import model.PersonaValidation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="formOK.htm")
public class FormOKController {
    private PersonaValidation personaValidation;
    public FormOKController(){
        this.personaValidation=new PersonaValidation();        
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView formOK(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("formOK");
        mav.addObject("personaOK",new PersonaOK());
        return mav;
    }
    //validar datos de formulario
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView formOK(
            @ModelAttribute("personaOK") PersonaOK p,
            BindingResult result,
            SessionStatus status){
        this.personaValidation.validate(p, result);
        if(result.hasErrors()){
            //aca se vuelve al formulario
            ModelAndView mav=new ModelAndView();
            mav.setViewName("formOK");
            mav.addObject("personaOK",new PersonaOK());
            return mav;            
        }else{
            //todo OK
            ModelAndView mav=new ModelAndView();
            mav.setViewName("exitoOK");
            mav.addObject("nombre",p.getNombre());
            mav.addObject("correo",p.getCorreo());
            mav.addObject("pais",p.getPais());
            return mav;            
        }
    }    
    
    //Pobrar un select
    @ModelAttribute("paisLista")
    public Map<String,String> listadoEdades(){
        Map <String,String> pais=new LinkedHashMap<>();
        pais.put("1", "Mexico");
        pais.put("2", "Colombia");
        pais.put("3", "España");
        pais.put("4", "Chile");       
        return pais;
    }
}
