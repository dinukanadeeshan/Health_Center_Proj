package com.unicorn.co226.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private final Connection con;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HealthCenter", "root", "123");
    }


    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) dbConnection = new DBConnection();

        return dbConnection;
    }

    public Connection getConnection(){ return con;}

}
