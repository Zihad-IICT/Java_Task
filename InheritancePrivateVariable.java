package OOP;

class Person1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
class Teacher1 extends Person1{
    private String Qualification;
    private double result;

    public String getQualification() {
        return Qualification;
    }
    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public double getResult() {
        return result;
    }



    public void setResult(double result) {
        this.result = result;
    }
    void display(){
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Qualification"+getQualification());
        System.out.println("Result"+getResult());
    }
}
public class InheritencePrivateVariable {
    public static void main(String[] args) {
        Teacher1 t1=new Teacher1();
        t1.setName("Zihad");
        t1.setAge(21);
        t1.setQualification("BSc in SWE");
        t1.setResult(3.75);
        t1.display();
        System.out.println();
        Teacher1 t2=new Teacher1();
        t2.setName("Munna");
        t2.setAge(22);
        t2.setQualification("BSc in SWE");
        t2.setResult(3.80);
        t2.display();

    }
}
