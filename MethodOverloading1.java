package OOP;
class MethodOverloading1{
    void add(){
        System.out.println("Nothing to add");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading1 ob=new MethodOverloading1();
        ob.add();
        ob.add(7,9);
        ob.add(6.8,4.7);
        ob.add(7,4,9);
        ob.add(77,44,8,6);

    }
}
