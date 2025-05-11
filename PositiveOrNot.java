package PrcaticePrbOOP;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter an Integer Number:");
        n= input.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Not a Positive Number");
        }

    }
}
