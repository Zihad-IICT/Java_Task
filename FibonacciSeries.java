package PrcaticePrbOOP;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n= input.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.print(" "+first);
        System.out.print(" "+second);
        for(int i=3;i<=n;i++){
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }

    }
}
