package PrcaticePrbOOP;
import java.util.Scanner;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n= input.nextInt();
        int count=0;
        if(n==0 || n==1){
            System.out.println("Null");
        }
        for(int i=2;i<=n/2;i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
            if(count==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
    }
}
