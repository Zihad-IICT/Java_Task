package PrcaticePrbOOP;
import java.util.Scanner;
class GradeBook{
    String courseName;
    public void displayMessage (){
        System .out.printf("Welcome to the grade book for\n%s!\n",courseName );
    }
}
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeBook myGradeBook = new GradeBook();
        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine();
        System.out.println();
        myGradeBook.displayMessage();
    }
}


