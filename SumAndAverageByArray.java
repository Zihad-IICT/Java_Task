package BasicJava;
import java.util.Scanner;
public class SumAndAvgByArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double [] number;
        number=new double[5];
        //double [] number=new double[5];
        System.out.print("Enter 5 numbers=");
        double sum=0;
        for(int i=0;i<5;i++){
            number[i]=input.nextDouble();
        }
        for(int i=0;i<number.length;i++){//for(int x:num)-for each loop
            sum=sum+number[i];
        }
        System.out.println("Sum is="+sum);
        double avg=sum/5;
        System.out.println("Average is="+avg);
        double max=number[0];
        double min=number[0];
        for(int i=1;i<5;i++){
            if(max<number[i]){
                max=number[i];
            }
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Maximum number="+max);
        System.out.println("Miniimum number="+min);
    }
}
