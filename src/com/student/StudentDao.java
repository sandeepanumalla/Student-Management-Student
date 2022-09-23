package com.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st){
        boolean flag = false;
        try {
            Connection con = ConnectionProvider.createConnection();
            String query = "INSERT INTO students_info(student_name, student_phone, student_city) values(?, ?, ?)";
            
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, st.getStudentName());
            statement.setString(2, st.getStudentPhone());
            statement.setString(3, st.getStudentCity());
            statement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean deleteStudentFromDB(int st){
        boolean flag = false;
        Connection con;
        try {
            con = ConnectionProvider.createConnection();
            String query = "DELETE FROM students_info WHERE student_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, st);
            statement.executeUpdate();
            con.prepareStatement(query);
            flag = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }

}
