//演示类的定义对象生成及使用
class MCircle
{
    final double PI=3.1415936;
    private float radius;
    MCircle(){
        this.radius=0;
    }
    MCircle(float radius)
    {
        this.radius=radius;
    }
    void setRadius(float radius)
    {
        this.radius=radius;
    }
    float getRadius()
    {
        return radius;
    }
    double area()
    {
        return PI*radius*radius;
    }
    double circle()
    {
        return 2*PI*radius;
    }
}
public class
Java030801 {
    public static void main(String args[]){
        MCircle obj=new MCircle(10);
        System.out.println("初始圆的信息");
        System.out.println("半径="+obj.getRadius());
        System.out.println("周长="+obj.circle());
        System.out.println("面积="+obj.area());
        obj.setRadius(3);
        System.out.println("重新设置后圆额信息");
        System.out.println("半径="+obj.getRadius());
        System.out.println("周长="+obj.circle());
        System.out.println("面积="+obj.area());
    }
}
