package OOP;

class Person {
    String name;
    int age;
    void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class Teacer extends Person{
    String qualification;
    String height;
    int weight;
    void displayInformation2(){
        //System.out.println("Name:"+name);
        //System.out.println("Age:"+age);
        displayInformation();
        System.out.println("Qualification:"+qualification);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
    }
}
public class Inheritence1 {
    public static void main(String[] args) {
        Teacer t1=new Teacer();
        t1.name= "Zihad";
        t1.age=21;
        t1.qualification="BSc in Software Engineering";
        t1.height= "5ft 3'";
        t1.weight=60;
        t1.displayInformation();
        t1.displayInformation2();


    }
}
