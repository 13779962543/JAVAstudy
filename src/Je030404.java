//演示实例变量和静态变量内存分配的差异
class A{
    static int x;
    int y;
    void setx(int x0){
        x=x0;
    }
    void sety(int y0){
        y=y0;
    }
    void showx(){
        System.out.println("x="+x);
    }
    void showy(){
        System.out.println("y="+y);
    }
}
public class Je030404 {
    public static void main(String args[]){
        A a1=new A();
        A a2=new A();
        //shart1
        System.out.println("通过a1来设置x和y的值");
        a1.setx(1);
        a1.showx();
        a2.showx();
        a1.sety(2);
        a1.showy();
        a2.showy();
        //start2
        System.out.println("通知a2来设置x和y的值");
        a2.setx(3);
        a1.showx();
        a2.showx();
        a2.sety(4);
        a1.showy();
        a2.showy();
    }
}
