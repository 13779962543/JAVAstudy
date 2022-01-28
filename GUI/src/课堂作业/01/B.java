public interface B{
    String strB="①这是接口B。";
    String mB();
}

class B1 implements B{
    public String mB(){
        return "②B1类实现了B接口。";
    }
    public String mB1(){
        return "③这是B1类的新成员方法mB1()。";
    }

}

class B2 implements B{
    public String mB(){
        return "④B2类实现了B接口。";
    }
}

class TestB{
    static void Bb(B b){
        System.out.println(b.strB);
        System.out.println(b.mB());
        if(b instanceof B1){
            B1 b1=(B1)b;
            System.out.println(b1.mB1());
        }
    }
    public static void main(String[] args){
        B b1=new B1();
        B b2=new B2();
        Bb(b1);
        Bb(b2);
    }
}

