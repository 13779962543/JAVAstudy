package Study;

class Outlai{
    String name;
    int age;
    public Outlai(int a){
        age=a;
    }
    public Outlai(String n, int a){
        name=n;
        age=a;
    }
    public void speak(){
        System.out.println("我今年"+age+"岁了");
    }
    public void say(){
        System.out.println("我叫"+name+"，今年"+age+"岁了");

    }
}
public class Example18 {
    public static void main(String[] args){
        Outlai p1=new Outlai(18);
        Outlai p2=new Outlai("白羽",32);
        p1.speak();
        p2.say();
    }
}
