package OOP;

class TeacherParametarisedMethod2 {
    String name,gender;
    int roll,phone;
    void setInformation(String n,String g,int r,int p){
        name=n;
        gender =g;
        roll=r;
        phone=p;
    }
    void displayInformation(){
        System.out.println("Name="+name);
        System.out.println("Gender="+gender);
        System.out.println("Roll="+roll);
        System.out.println("Phone="+phone);
        System.out.println();
    }

}
public class TeacherParametarisedMethod{
    public static void main(String[] args) {
        TeacherParametarisedMethod2 teacher1=new TeacherParametarisedMethod2();
        teacher1.setInformation("Zihadul Islam","male",2022831031,1815283787);
        teacher1.displayInformation();

        TeacherParametarisedMethod2 teacher2=new TeacherParametarisedMethod2();
        teacher2.setInformation("Shakibul Islam","male",2022831013,1815283787);
        teacher2.displayInformation();
    }

}
