package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public static void insertStudentToDB(Student st){
        try {
            Connection con = ConnectionProvider.createConnection();
            String query = "insert into students_info(student_name, student_phone, student_city) values(?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(q);
            
            // stmt = con.createStatement();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
