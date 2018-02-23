package control;

import javax.servlet.http.HttpServletRequest;
import model.Conection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class DeleteController {
    private JdbcTemplate jdbcTemplate;
    
    public DeleteController(){        
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView form(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("idUsuario"));
        this.jdbcTemplate.update("DELETE FROM usuarios "            
            + "WHERE idUsuario=? ",
            id);
        return new ModelAndView("redirect:/home.htm");
    }   
}
