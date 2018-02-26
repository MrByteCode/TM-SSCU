package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conection;
import model.Usuarios;
import org.springframework.stereotype.Service;

@Service
public class DaoUsuarios {

    public static List<Usuarios> selectUsuarios() throws SQLException, ClassNotFoundException{        
        List<Usuarios> listUsuarios = new ArrayList<>();   
        System.out.println("::::::::: CORRE AQUI");
        PreparedStatement ps=null;
        ResultSet rs;
        Connection con=Conection.createConectionPS();                        
        ps=con.prepareStatement("SELECT * FROM USUARIOS"); 
        ps.executeQuery();
        rs=ps.getResultSet();                
        while(rs.next()){
            Usuarios usuario=new Usuarios();
            usuario.setIdUsuario(rs.getInt("idusuario"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setCorreo(rs.getString("correo"));
            usuario.setTelefono(rs.getString("telefono"));
            listUsuarios.add(usuario);            
        }
        return listUsuarios;
    }
//    
//    public Usuarios selectUsuario(int id){
//        final Usuarios usuario=new Usuarios();
//        String query="SELECT * FROM usuarios WHERE idUsuario='"+id+"'";
//        return (Usuarios) jdbcTemplate.query(query, new ResultSetExtractor<Usuarios>(){
//            public Usuarios extractData (ResultSet rs) throws SQLException, DataAccessException{
//                if(rs.next()){
//                    usuario.setNombre(rs.getString("nombre"));
//                    usuario.setCorreo(rs.getString("correo"));
//                    usuario.setTelefono(rs.getString("telefono"));
//                }
//                return usuario;
//                }
//            }
//        );
//    }
}

        //select * from ....... 
//        for(int i = 0; i<10; i++){            
//            Usuarios user = new Usuarios(i, "Name: " + i);
//            listUsuarios.add(user);
//        }        
//        return listUsuarios;
//    }        
