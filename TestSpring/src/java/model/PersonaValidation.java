package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonaValidation implements Validator{

    private static final String EMAIL_PATTERN="^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    private Pattern p;
    private Matcher m;

    @Override
    public boolean supports(Class<?> type) {
        return PersonaOK.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        PersonaOK persona = (PersonaOK) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","El campo nombre es obligatorio");        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "correo", "required.correo","El campo correo es obligatorio");
        if(! (persona.getCorreo() !=null && persona.getCorreo().isEmpty())){
            this.p = Pattern.compile(EMAIL_PATTERN);
            this.m = p.matcher(persona.getCorreo());
            if(!m.matches()){
                errors.rejectValue("correo", "correo.incorrect","El email "+persona.getCorreo()+" ingresado es invalido");                
            }   
        }
        if(persona.getPais()==0){
            errors.rejectValue("pais", "required.pais","Seleccione un pais");                
        }
    }    
}
