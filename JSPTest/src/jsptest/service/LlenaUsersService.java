/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsptest.service;

import java.util.ArrayList;
import java.util.List;
import jsptest.dao.DaoFIle;
import jsptest.dao.DaoUser;
import jsptest.dto.UserFileDTO;
import jsptest.model.File;
import jsptest.model.User;

/**
 *
 * @author Spartan
 */
public class LlenaUsersService {
    
    public static List<UserFileDTO> getUsers(){
        List<UserFileDTO> lisrUsersDTO = new ArrayList<>();        
        
        List<User> listUser = DaoUser.selectUsers();  
        
        for(User user : listUser){
            UserFileDTO userDTO = new UserFileDTO();            
            userDTO.setUser(user);
                        
            // Deberiamos recuperar por ID de Usuario
            List<File> listFile = DaoFIle.selectFiles(); 
            userDTO.setListFile(listFile);
            
            lisrUsersDTO.add(userDTO);
        }
        
        return lisrUsersDTO;
    }
    
}
