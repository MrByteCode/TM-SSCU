/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsptest.controller;

import java.util.List;
import jsptest.dto.UserFileDTO;
import jsptest.model.File;
import jsptest.service.LlenaUsersService;

/**
 *
 * @author Spartan
 */
public class ControllerUsers {
    
    public static void getUsers(){
        List<UserFileDTO> listUser = LlenaUsersService.getUsers();
        
        for(UserFileDTO user : listUser){
            System.out.println("User name: " + user.getUser().getName());
            for(File file : user.getListFile()){
                System.out.println("\tFile name: " + file.getNombre());
            }
        }
    }
}
