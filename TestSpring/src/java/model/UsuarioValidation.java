package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UsuarioValidation implements Validator{

    private static final String EMAIL_PATTERN="^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    private Pattern p;
    private Matcher m;

    @Override
    public boolean supports(Class<?> type) {
        return Usuario.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Usuario usuario = (Usuario) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","El campo nombre es obligatorio");        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "correo", "required.correo","El campo correo es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "required.telefono","El campo telefono es obligatorio");
        if(! (usuario.getCorreo() !=null && usuario.getCorreo().isEmpty())){
            this.p = Pattern.compile(EMAIL_PATTERN);
            this.m = p.matcher(usuario.getCorreo());
            if(!m.matches()){
                errors.rejectValue("correo", "correo.incorrect","El email "+usuario.getCorreo()+" ingresado es invalido");                
            }   
        }
        if(usuario.getTelefono().length()>12){
            errors.rejectValue("telefono", "required.telefono","Longuitud de telefono excede el limite permitido");
        }
    }    
}
