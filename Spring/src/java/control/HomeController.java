package control;

import java.util.List;
import model.Conection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {
    private JdbcTemplate jdbcTemplate;
    
    public HomeController(){
        Conection con=new Conection();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @RequestMapping(value="home.htm")
    public ModelAndView add(){
        ModelAndView mav=new ModelAndView();
        String sql="SELECT * FROM USUARIOS";
        List datos=jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("home");        
        return mav;
    }
}