import Student;
import Course;

public class Attendance {
    
    //Variable Declaration
    Object Student;
    Object Course;
    //Method Declaration
    //main is the function that runs first and starts the lifecycle
    public static void main(String[] args) {
        
        
        Course codeLab = new Course();
        Student studentOne = new Student(John, Doe, 001);
        Student studentTwo = new Student(Jane, Doe, 002);
        codeLab.addStudent(studentOne);
        codeLab.addStudent(studentTwo);
        System.out.print(codeLab.print.students);
        
        // TODO: Create at least 2 student objects
        // TODO: Add students to the codeLab Course
        // Display Role Call
        
    }
    
}