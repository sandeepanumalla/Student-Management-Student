import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.crypto.Cipher;

import com.student.Student;
import com.student.StudentDao;




public class App {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Welcome to Student Management System");
        boolean b = false;
        while(true){
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("press 4 to exit the app");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    Student insertStudent = Student.getInput(br);
                    if(StudentDao.insertStudentToDB(insertStudent)){
                        System.out.println("Data added successfully. Thanks");
                    }
                    else{
                        System.out.println("Data not added");
                    }
                    continue;
                case 2:
                    System.out.println("Enter student id");
                    int studentId = Integer.parseInt(br.readLine());
                    if(StudentDao.deleteStudentFromDB(studentId)){
                        System.out.println("student deleted successfully");
                    }
                    else{
                        System.out.println("data not deleted");
                    }
                    continue;
                case 3:
                    // System.out.println("");
                    continue;
                case 4:
                    b = true;
                    break;
                default:
                   System.out.println("wrong option.... please select again");
                   continue;
            }
            if(b){
                break;
            }
            // break;
        }
        
        // System.out.println("thank you for using our application");
    }
}
