package OOP;

class Constructor {
    String name,gender;
    int roll,phone;
    Constructor(String n,String m,int r,int p) {
        name = n;
        gender = m;
        roll = r;
        phone = p;
    }
        void displayInformation(){
            System.out.println("Name="+name);
            System.out.println("Gender="+gender);
            System.out.println("Roll="+roll);
            System.out.println("Phone="+phone);
            System.out.println();
        }

}
public class Constructor1{
    public static void main(String[] args) {
        Constructor teacher1=new Constructor("Zihadul Islam","male",2022831031,1815283787);
        teacher1.displayInformation();
        Constructor teacher2=new Constructor("Shakibul Islam","male",2022831013,1815283787);
        teacher2.displayInformation();
    }
}

