package PrcaticePrbOOP;

import java.util.Scanner;

public class BuildACalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,sum,sub,multiplication,divide;
        System.out.print("Enter the value of a=");
        a= input.nextInt();
        System.out.print("Enter the value of b=");
        b= input.nextInt();
        System.out.print("Enter the Operation(+,-,*,/)=");
        char ch = input.next().charAt(0);
        if(ch=='+'){
            System.out.println("Result="+(a+b));
        }
        else if(ch=='-'){
            System.out.println("Result="+(a-b));
        }
        else if(ch=='*'){
            System.out.println("Result="+(a*b));
        }
        else if(ch=='/' && b!=0){
            System.out.println("Result="+(a/b));
        }
        else{
            System.out.println("Invalid result");
        }

    }
}
