package PrcaticePrbOOP;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n=");
        n= input.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap year");
        }

    }
}
