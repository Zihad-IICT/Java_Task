package PrcaticePrbOOP;
import java.util.Scanner;
public class ReverseAGivenArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n= input.nextInt();
        System.out.print("Enter some numbers=");
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=input.nextInt();
        }
        System.out.print("Reverse Series=");
        for(int i=n-1;i>=0;i--){
            System.out.print(" "+num[i]);
        }
    }
}
