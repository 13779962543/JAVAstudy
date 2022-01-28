package prac04;

public class student15 {

    public void getDistance(double x , double y, double x2, double y2){
        double j1 = Math.sqrt(x*x+y*y);
        double j2 = Math.sqrt(x2*x2+y2*y2);
        double j3 = Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
        System.out.println("点A到原点的距离是" + j1);
        System.out.println("点B到原点的距离是" + j2);
        System.out.println("点A到点B的距离是" + j3);
    }
}
class TestMyPoint{
    public static void main(String[] args){
        student15 p = new student15();
        p.getDistance(3.4,5.8,-6.3,7.1);
    }
}