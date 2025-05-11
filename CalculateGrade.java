package PrcaticePrbOOP;

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n=");
        n= input.nextInt();
        if(n>=0 && n<=39){
            System.out.println("F");
        }
        else if(n>=40 && n<=59){
            System.out.println("C+");
        }
        else if(n>=60 && n<=69){
            System.out.println("B");
        }
        else if(n>=70 && n<=79){
            System.out.println("A-");
        }
        else if(n>=80 && n<=89){
            System.out.println("A");
        }
        else
            System.out.println("A+");
        }
    }

