package PrcaticePrbOOP;

public class PrintSeries {
    public static void main(String[] args) {
        int sum1=0,sum2=0;
        for(int i=2;i<=20;i=i+2){
            System.out.print(i+",");
            sum1=sum1+i;
        }
        System.out.println();
        System.out.println("Sum1="+sum1);

        System.out.println();
        for(int i=1;i<=20;i=i+2){
            System.out.print(i+",");
            sum2=sum2+i;

        }
        System.out.println();
        System.out.println("Sum2="+sum2);
    }
}
