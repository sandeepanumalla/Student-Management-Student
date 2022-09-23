package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static Connection con;
    public static Connection createConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "Sandeep99!";
            String url = "jdbc:mysql://localhost:3306/student_management_sys";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
