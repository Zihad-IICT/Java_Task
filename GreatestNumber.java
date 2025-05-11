package PrcaticePrbOOP;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=input.nextInt();
        System.out.print("Enter some numbers=");
        int [] number=new int[n];
        for(int i=0;i<n;i++){
            number[i]=input.nextInt();
        }
        int greatestNumber=number[0];
        for(int i=0;i<n;i++){
            if (number[i]>greatestNumber) {
                greatestNumber=number[i];
            }
        }
        System.out.println("Greatest Number="+greatestNumber);

    }
}
