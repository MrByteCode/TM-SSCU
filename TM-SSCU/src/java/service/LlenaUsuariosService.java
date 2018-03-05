package service;

import dao.DAOFileMeta;
import dao.DaoUsuarios;
import dto.DTOUsuarioFile;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FileMeta;
import model.Usuarios;

public class LlenaUsuariosService {
        
    public static List<DTOUsuarioFile> getUsers() throws SQLException, ClassNotFoundException{
        List<DTOUsuarioFile> listUsersDTO = new ArrayList<>();                
        List<Usuarios> listUser = DaoUsuarios.selectUsuarios();          
        for(Usuarios user : listUser){
            DTOUsuarioFile userDTO = new DTOUsuarioFile();            
            List<FileMeta> listFile = DAOFileMeta.selectFileMetaByUsuario(user.getIdUsuario()); 
            user.setFileMetaList(listFile);
            userDTO.setUser(user);            
            listUsersDTO.add(userDTO);
        }
        
        return listUsersDTO;
    }            
    
    public Usuarios getUserById(int id) throws SQLException, ClassNotFoundException{
        final Usuarios usuario=new DaoUsuarios().selectUsuario(id);
        List<FileMeta> listFile = DAOFileMeta.selectFileMetaByUsuario(usuario.getIdUsuario()); 
        usuario.setFileMetaList(listFile);
        return usuario;
    }            
    
    public static List<Usuarios> getUsuarios() throws SQLException, ClassNotFoundException{
        List<Usuarios> listUser  = new ArrayList<>();   
        listUser = DaoUsuarios.selectUsuarios();        
        for(Usuarios user : listUser){
            List<FileMeta> listFile = DAOFileMeta.selectFileMetaByUsuario(user.getIdUsuario()); 
            user.setFileMetaList(listFile);            
            listUser.add(user);
        }        
        return listUser;
    }            
}
