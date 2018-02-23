/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsptest.dto;

import java.util.List;
import jsptest.model.File;
import jsptest.model.User;

/**
 *
 * @author Spartan
 */
public class UserFileDTO {
    private User user;
    private List<File> listFile;
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getListFile() {
        return listFile;
    }

    public void setListFile(List<File> listFile) {
        this.listFile = listFile;
    }        
    
}
