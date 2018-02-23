package model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conection {
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/shtm");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}
