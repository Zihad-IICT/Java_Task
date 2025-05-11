package PrcaticePrbOOP;
import java.util.Scanner;
public class CountOddandEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=input.nextInt();
        System.out.print("Enter some number=");
        int [] num=new int[n];
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<n;i++){
            num[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(num[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Total Odd Number="+oddCount);
        System.out.println("Total Even Number="+evenCount);
    }
}
