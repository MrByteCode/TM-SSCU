/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsptest.dao;

import java.util.ArrayList;
import java.util.List;
import jsptest.model.User;

/**
 *
 * @author Spartan
 */
public class DaoUser {
    
    public static List<User> selectUsers(){        
        List<User> listUser = new ArrayList<>();   
        //select * from ....... 
        for(int i = 0; i<10; i++){            
            User user = new User(i, "Name: " + i);
            listUser.add(user);
        }        
        return listUser;
    }    
    
}
