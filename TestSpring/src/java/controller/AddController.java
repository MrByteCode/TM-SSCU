package controller;

import java.util.List;
import model.Conectar;
import model.Persona;
import model.PersonaOK;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AddController {
    private JdbcTemplate jdbcTemplate;
    
    public AddController(){
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    @RequestMapping(value="add.htm")
    public ModelAndView add(){
        ModelAndView mav=new ModelAndView();
        String sql="select * from usuarios";
        List datos=jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("add");        
        return mav;
    }
}
