/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsptest.dao;

import java.util.ArrayList;
import java.util.List;
import jsptest.model.File;


/**
 *
 * @author Spartan
 */
public class DaoFIle {
    
    public static List<File> selectFiles(){        
        List<File> listFile = new ArrayList<>();  
        // select * from llñlkñkfñklñ
        for(int i = 0; i<10; i++){            
            File file = new File(i, "File: " + i);
            listFile.add(file);
        }        
        return listFile;
    }   
}
