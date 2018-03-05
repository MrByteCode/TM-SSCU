package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conection;
import model.Usuarios;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DaoUsuarios {
    public static List<Usuarios> selectUsuarios() throws SQLException, ClassNotFoundException{        
        List<Usuarios> listUsuarios = new ArrayList<>();   
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
    
    public Usuarios selectUsuario(int id) throws ClassNotFoundException, SQLException{
        final Usuarios usuario=new Usuarios();
        PreparedStatement ps=null;
        ResultSet rs;
        Connection con=Conection.createConectionPS();                        
        ps=con.prepareStatement("SELECT * FROM usuarios WHERE idUsuario='"+id+"'"); 
        ps.executeQuery();
        rs=ps.getResultSet();                
        while(rs.next()){
            usuario.setIdUsuario(rs.getInt("idusuario"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setCorreo(rs.getString("correo"));
            usuario.setTelefono(rs.getString("telefono"));
        }
        return usuario;
    }
}