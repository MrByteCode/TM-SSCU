package model;

import java.sql.Blob;

public class FileMeta {
    private int idFile;
    private String fileName;
    private String fileSize;
    private String fileType;
    private int fileIdUsuario;
    private Blob documentoBlob;

    public FileMeta(){
        
    }
    public int getFileIdUsuario() {
        return fileIdUsuario;
    }

    public void setFileIdUsuario(int fileIdUsuario) {
        this.fileIdUsuario = fileIdUsuario;
    }
    private byte[] bytes;
 
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
    
    public Blob getDocumentoBlob() {
        return documentoBlob;
    }

    public void setDocumentoBlob(Blob documentoBlob) {
        this.documentoBlob = documentoBlob;
    }

    public int getIdFile() {
        return idFile;
    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }
}