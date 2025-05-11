package OOP;

class Shape{
    double area(){
        System.out.println("area for shape:");
        return 0;
    }
}
class Rectengle2 extends Shape{
double length,width;
Rectengle2(double length,double width){
    this.length=length;
    this.width=width;
}
double area(){
    return length*width;
}
}
class Triangle2 extends Shape {
    double base, height;

    Triangle2(double base, double height) {
        this.base = base;
        this.height= height;
    }

    double area() {
        return 0.5* base * height;
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Shape [] s=new Shape[3];
        s[0]=new Shape();
        s[1]=new Rectengle2(10,20);
        s[2]=new Triangle2(10,20);
        for(int i=0;i<3;i++){
            System.out.println(s[i].area());
        }

    }
}
