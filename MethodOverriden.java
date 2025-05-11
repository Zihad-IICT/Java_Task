package OOP;

class MethodOverride{
    String name;
    int age;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class MethodOverridden extends MethodOverride{
    String qualification;

    @Override
    void display() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Qualification:"+qualification);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        MethodOverridden m1=new MethodOverridden();
        m1.name="Zihad";
        m1.age=21;
        m1.qualification="BSc in SWE";
        m1.display();
        System.out.println();
        MethodOverride m2=new MethodOverride();
        m2.name="Munna";
        m2.age=22;
        m2.display();
    }
}
