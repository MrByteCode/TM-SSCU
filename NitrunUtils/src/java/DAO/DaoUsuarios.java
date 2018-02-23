package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Usuarios;
import org.springframework.stereotype.Service;

@Service
public class DaoUsuarios {

    public static List<Usuarios> selectUsuarios(){        
        List<Usuarios> listUsuarios = new ArrayList<>();   
        //select * from ....... 
//        for(int i = 0; i<10; i++){            
//            Usuarios user = new Usuarios(i, "Name: " + i);
//            listUsuarios.add(user);
//        }        
        return listUsuarios;
    }        
}
