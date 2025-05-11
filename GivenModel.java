package PrcaticePrbOOP;

import java.util.Scanner;

public class GivenMedel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of grade=");
        double grade= input.nextDouble();
        System.out.print("Semester Completed=");
        String completed=input.next();
        if(grade>=3.5){
            if(completed.equalsIgnoreCase("yes")){
                System.out.println("Eligible for Medel");
            }
            else{
                System.out.println("Not Eligible for medel");
            }
        }
        else{
            System.out.println("Not eligible for medel");
        }
    }
}
