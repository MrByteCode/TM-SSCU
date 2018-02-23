package upv.pfc.pd;
import java.sql.*;

public class Consultar {	
    private Connection conn=null;
    private String password="admin";
    private String user="admin";
    private String bd="pd";
    private String url="jdbc:mysql://localhost:3306/";
    private String driver="com.mysql.jdbc.Driver";
    public String consultarRuta(String usuario) throws SQLException{
        String ruta="";
        conn = DriverManager.getConnection(url+bd,user,password);
        Statement stmt = conn.createStatement();
    ResultSet rs;
    rs = stmt.executeQuery("SELECT ruta FROM USERS WHERE username ='"+usuario+"'");
    while (rs.next()) {
        ruta = rs.getString("ruta");
    }
    conn.close();

        return ruta;
    }
    public void insertarUsuario(String user1,String pass, String aut,String ruta) throws SQLException{
        conn = DriverManager.getConnection(url+bd,user,password);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO users(USERNAME,PASSWORD,ENABLED) VALUES('"+user1+"','"+pass+"',true)");
        stmt.executeUpdate("INSERT INTO authorities(USERNAME,AUTHORITY) VALUES('"+user1+"','"+aut+"')");
        conn.close();
    }
}
