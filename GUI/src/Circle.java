public class Circle {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    Circle(){}
    Circle(double r){
        radius=r;
    }
    double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    };
    double getPerimeter(){
        return radius*2*Math.PI;
    }
    void disp(){
        System.out.println(radius);
        System.out.println(getPerimeter());
        System.out.println(getArea());
        System.out.println(getRadius());
    }
}
