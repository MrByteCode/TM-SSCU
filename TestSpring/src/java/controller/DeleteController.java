package controller;

import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class DeleteController {
    private JdbcTemplate jdbcTemplate;
    
    public DeleteController(){        
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView form(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        this.jdbcTemplate.update("DELETE FROM usuarios "            
            + "WHERE id=? ",
            id);
        return new ModelAndView("redirect:/add.htm");
    }   
}
