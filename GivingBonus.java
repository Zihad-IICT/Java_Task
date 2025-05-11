package PrcaticePrbOOP;
import java.util.Scanner;
public class GivingBonus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int targetSales,attendance;
        System.out.print("Enter target sales=");
        targetSales= input.nextInt();
        System.out.print("Enter attendance=");
        attendance= input.nextInt();
        if(targetSales>=95 && attendance==100){
            System.out.println("bonus=60%");
        }
        else if(targetSales>=95 && (attendance>=90 && attendance<100)){
            System.out.println("bonus=40%");
        }
        else if((targetSales>=80 && targetSales<95) && (attendance==100)){
            System.out.println("bonus=40%");
        }
        else if((targetSales>=80 && targetSales<95) && (attendance>=90 && attendance<100)){
            System.out.println("bonus=20%");
        }
        else{
            System.out.println("bonus=5%");
        }
    }
}
