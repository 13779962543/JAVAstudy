//演示类中成员变量，成员方法，局部变量，参数变量
class B{
    private int x;
    static int y;
    void set(int x){
        int a=10;
        if(x>0)
        a=10;
        else a=-10;
        this.x=a+x;
    }
    int getx()
    {
        return x;
    }
}
public class Je030401 {
    public static void main(String args[]){
        B a=new B();
        a.set(2);
        System.out.println("A.x="+a.getx());
        a.set(-2);
        System.out.println("A.x="+a.getx());
        a=null;
    }
}
