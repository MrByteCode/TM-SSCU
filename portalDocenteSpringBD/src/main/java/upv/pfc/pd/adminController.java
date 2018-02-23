package upv.pfc.pd;

import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerMapping;
import upv.pfc.pd.LeerEscribirFichero;

@Controller
public class adminController {	

    @RequestMapping(value = "/documentacion/java", method=RequestMethod.GET)
    public String docJava(){
        return "/documentacion/paginaJava";
    }
        
    @RequestMapping(value = "/tutorial/MVCP", method=RequestMethod.GET)
    public String tutMvc(){
    return "/tutorial/MVCP";
    }
    
    @RequestMapping(value = "/tutorial/AuMem", method=RequestMethod.GET)
    public String tutAuMem(){
    return "/tutorial/AuMem";
    }
    
    @RequestMapping(value = "/tutorial/AuCBd", method=RequestMethod.GET)
    public String tutAuBd(){
    return "/tutorial/AuCBd";
    }
    
    @RequestMapping(value = "/tutorial/AuBdHiber", method=RequestMethod.GET)
    public String tutAuBd1(){
    return "/tutorial/AuBdHiber";
    }
    
    @RequestMapping(value="/profesor/addE", method=RequestMethod.GET)
    public String addEnla(HttpServletRequest request,Model model){
            String restOfTheUrl = (String) request.getAttribute( HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
            Class cls = this.getClass();
            ProtectionDomain pDomain = cls.getProtectionDomain();
            CodeSource cSource = pDomain.getCodeSource();

            return "/profesor/addEnlace";
    }

    @RequestMapping(value="/profesor/addE",method = RequestMethod.POST)
    public String servirPagina(HttpServletRequest request){
            LeerEscribirFichero f=new LeerEscribirFichero();
            String enlace=request.getParameter("enlace");
            f.escribirF("C:\\Pfc/enlacesBD/enlacesBD.txt", enlace);

            return "addControl";
    }

    @RequestMapping(value="/alta",method=RequestMethod.GET)
    public String altaU(){
        return "alta";
    }

    @RequestMapping(value="/alta",method=RequestMethod.POST)
    public String altaUser(HttpServletRequest request) throws SQLException{
        String nombre=request.getParameter("userr");
        String autoridad=request.getParameter("rol");
        String passwordN=request.getParameter("contra");
        String ruta="C:\\Pfc/alumnos";
        Consultar c=new Consultar();
        c.insertarUsuario(nombre, passwordN, autoridad, ruta);
        return "home";
    }
}