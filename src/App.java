import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.crypto.Cipher;

import com.student.Student;

public class App {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Welcome to Student Management System");
        while(true){
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("press 4 to exit the app");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    System.out.println("Enter user name");
                    String name = br.readLine();
                    System.out.println("Enter user phone");
                    String phone = br.readLine();
                    System.out.println("Enter user's city");
                    String city = br.readLine();
                    Student st = new Student(name, phone, city);
                    System.out.println(st);
                case 2:
                    // break;
                case 3:
                    // break;
                case 4:
                    break;
                default:
                   System.out.println("wrong option.... please select again");
                   continue;
            }
            break;
        }
        
        System.out.println("thank you for using our application");
    }
}
