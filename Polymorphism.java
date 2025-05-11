package OOP;
 class Person3{
    void display(){
        System.out.print("I am a person");
        System.out.println("\n");
    }

}
 class Teacher3 extends Person3 {
    void display(){
        System.out.print("I am a Teacher");
        System.out.println("\n");
    }

}
class Student2 extends Person3{
    void display(){
        System.out.print("I am a student");
        System.out.println("\n");
    }

}
public class Polymorphism{
    public static void main(String[] args) {
        Person3 p1=new Person3();
        p1.display();

        p1=new Teacher3();
        p1.display();

        p1=new Student2();
        p1.display();
    }

}
