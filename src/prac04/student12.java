package prac04;
public class student12 {
    double pi=3.14;
    public double circleArea(double r){
        return pi*r*r;
    }
    public double ballVolume(double r){
        return 4.0/3*pi*r*r*r;
    }

    public double cylinderVolume(double r,double h){
        return circleArea(r)*h;
    }
}
class Testcalc{
    public static void main(String[] args){
        student12 calcu=new student12();
        double r=3.2;
        double h=6.3;
        System.out.println("圆的面积："+calcu.circleArea(r));
        System.out.println("球的体积："+calcu.ballVolume(r));
        System.out.println("圆柱的体积："+calcu.cylinderVolume(r,h));
    }
}