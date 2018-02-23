package upv.pfc.pd;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("subirArchivo")
public class formularioController {
    
	private static final Logger logger = LoggerFactory.getLogger(formularioController.class);
	@RequestMapping(method = RequestMethod.GET)
    public @ModelAttribute("fileFormBean") FileFormBean getInitialMessage() {
        return new FileFormBean();
    }
 
    @RequestMapping(value="/subirArchivo", method = RequestMethod.POST)
    public @ModelAttribute("message") void guardaFichero(@ModelAttribute FileFormBean fileFormBean,Principal principal,HttpServletRequest request) {
         
        try {
            grabarFicheroALocal(fileFormBean,principal,request);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("No se ha podido grabar el fichero");
        }
         
        logger.info("Fichero grabado correctamente");
    }
 
    private String grabarFicheroALocal(FileFormBean fileFormBean,Principal principal,HttpServletRequest request) throws Exception {
        CommonsMultipartFile uploaded = fileFormBean.getFichero();
        Consultar c=new Consultar();
       File folder=new File(c.consultarRuta(principal.getName())+"/"+principal.getName());
       //logger.info("La ruta es :"+folder.toString());
       if(!folder.exists())
       {
    	  //logger.info("entra");
    	   folder.mkdirs();
       }
        File localFile = new File(c.consultarRuta(principal.getName())+"/"+principal.getName()+"/"+uploaded.getOriginalFilename());
        FileOutputStream os = null;
         
        try {
             
            os = new FileOutputStream(localFile);
            os.write(uploaded.getBytes());
             
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return "home";
    }
}

