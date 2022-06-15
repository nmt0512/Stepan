package com.mycompany.app.db;

import java.sql.DriverManager;
import java.sql.Connection;

public class getDBconnection {

    public static Connection getConnection() throws Exception {
        String username = "phong";
        String pass = "nhuphong123";
        String connectionURL = "jdbc:sqlserver://localhost:1433;database=QLSV;";
        Connection con = DriverManager.getConnection(connectionURL, username, pass);
        return con;
    }
}