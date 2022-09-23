package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;

import org.junit.jupiter.api.Assertions;

public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;
    public Student( String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentPhone() {
        return studentPhone;
    }
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getStudentCity() {
        return studentCity;
    }
    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public static Student getInput(BufferedReader br){
                    Student st = null;
                    try {
                        System.out.println("Enter user name");
                        String name = br.readLine();
                        System.out.println("Enter user phone");
                        String phone = br.readLine();
                        System.out.println("Enter user's city");
                        String city = br.readLine();
                         st = new Student(name, phone, city); 
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return st;
    }

    @Override
    public String toString() {
        return "Student [studentCity=" + studentCity + ", studentId=" + studentId + ", studentName=" + studentName
                + ", studentPhone=" + studentPhone + "]";
    }
    
}
