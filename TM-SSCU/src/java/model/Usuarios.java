package model;

import java.io.File;
import java.io.Serializable;
import java.sql.Blob;
import java.util.List;

public class Usuarios implements Serializable {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private File documento;
    private Blob documentoBlob;
    private List<FileMeta> fileMetaList;
    
    public Usuarios() {
    }        

//    public Usuarios(int idUsuario, String nombre, String correo, String telefono, File documento) {
//        this.idUsuario = idUsuario;
//        this.nombre = nombre;
//        this.correo = correo;
//        this.telefono = telefono;
//        this.documento = documento;
//    }
//
//    public Usuarios(String nombre, String correo, String telefono, File documento) {
//        this.nombre = nombre;
//        this.correo = correo;
//        this.telefono = telefono;
//        this.documento = documento;
//    }

    public Usuarios(int idUsuario, String nombre, String correo, String telefono, List<FileMeta> fileMetaList) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.fileMetaList = fileMetaList;
    }    

    public Usuarios(int idUsuario, List<FileMeta> fileMetaList) {
        this.idUsuario = idUsuario;
        this.fileMetaList = fileMetaList;
    }  
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    

    public File getDocumento() {
        return documento;
    }

    public void setDocumento(File documento) {
        this.documento = documento;
    }

    public Blob getDocumentoBlob() {
        return documentoBlob;
    }

    public void setDocumento(Blob documentoBlob) {
        this.documentoBlob = documentoBlob;
    }

    public List<FileMeta> getFileMetaList() {
        return fileMetaList;
    }

    public void setFileMetaList(List<FileMeta> fileMetaList) {
        this.fileMetaList = fileMetaList;
    }
}