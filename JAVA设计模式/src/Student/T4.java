package Student;
interface IColor{
    public void setColor();
}
class Car implements IColor {
    public IColor color;
    public void move(){

    }

    @Override
    public void setColor() {

    }
}
class Red implements IColor {
    public void setColor() {
        System.out.println("颜色:红色");
    }
}
class White implements IColor {
    public void setColor() {
        System.out.println("颜色:白色");
    }
}
class Black implements IColor {
    public void setColor() {
        System.out.println("颜色:黑色");
    }
}
class DDCar extends Car{
    public void move(){
        System.out.println("有电才能动");
        color.setColor();
    }
}
class OYCar extends Car{
    public void move(){
        System.out.println("有汽油才能动");
        color.setColor();
    }
}
public class T4 {
    public static void main(String[] args)
    {
        Car c=new OYCar();
        Car dd=new DDCar();
        Red r=new Red();
        White w=new White();
        dd.color=r;
        c.color=c;
        c.move();
    }
}
