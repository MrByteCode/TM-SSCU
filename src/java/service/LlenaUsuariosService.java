package service;

import DAO.DAOFileMeta;
import DAO.DaoUsuarios;
import DTO.DTOUsuarioFile;
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

    public static List<Usuarios> getUsuarios() throws SQLException, ClassNotFoundException{
        System.out.println("::::::::: CORRE AQUI");
        List<Usuarios> listUser  = new ArrayList<>();   
        listUser = DaoUsuarios.selectUsuarios();        
        for(Usuarios user : listUser){
            List<FileMeta> listFile = DAOFileMeta.selectFileMetaByUsuario(user.getIdUsuario()); 
            System.out.println(":::::::::"+user.getIdUsuario());
            user.setFileMetaList(listFile);            
            listUser.add(user);
        }        
        return listUser;
    }            
}
