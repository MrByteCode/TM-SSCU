/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conection;
import model.FileMeta;

public class DAOFileMeta {
    public static List<FileMeta> selectFileMeta() throws SQLException, ClassNotFoundException{        
        List<FileMeta> listFileMeta = new ArrayList<>();           
        PreparedStatement ps=null;
        ResultSet rs;
        Connection con=Conection.createConectionPS();                        
        ps=con.prepareStatement("SELECT * FROM FILES"); 
        ps.executeQuery();
        rs=ps.getResultSet();                
        if(rs.next()){
            FileMeta files=new FileMeta();
            files.setFileIdUsuario(rs.getInt("idUsuario"));
            files.setFileName(rs.getString("name"));
            files.setFileSize(rs.getString("size"));
            files.setFileType(rs.getString("type"));
            listFileMeta.add(files);            
        }
        return listFileMeta;
    }

    public static List<FileMeta> selectFileMetaByUsuario(int i) throws SQLException, ClassNotFoundException{        
        List<FileMeta> listFileMeta = new ArrayList<>();        
        PreparedStatement ps=null;
        ResultSet rs;
        Connection con=Conection.createConectionPS();                        
        ps=con.prepareStatement("SELECT * FROM FILES WHERE IdUsuario='"+i+"'"); 
        ps.executeQuery();
        rs=ps.getResultSet();                
        while(rs.next()){
            FileMeta files=new FileMeta();
            files.setFileIdUsuario(rs.getInt("idUsuario"));
            System.out.println(":::::::::"+rs.getInt("idUsuario"));
            files.setFileName(rs.getString("name"));
            files.setFileSize(rs.getString("size"));
            System.out.println(":::::::::"+rs.getString("name"));
            files.setFileType(rs.getString("type"));
            listFileMeta.add(files);            
        }
        return listFileMeta;
    }    
}
