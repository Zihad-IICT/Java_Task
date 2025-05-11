package PrcaticePrbOOP;

import java.util.Scanner;

public class P3Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n= input.nextInt();
        double sum = 0;
        double [] number = new double[n];
        System.out.print("Enter some number=");
        for (int i = 0; i < n; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " +number[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            sum=sum+number[i];
        }
        System.out.println("sum= "+sum);
        System.out.println("Average="+(sum/n));
    }
}
