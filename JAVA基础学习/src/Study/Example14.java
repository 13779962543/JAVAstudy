package Study;

class Personal {
    String name;
    int age;
    public void speak(){
        System.out.println("我叫"+name+",今年"+age+"岁了");
    }
}
public class Example14{
    public static void main(String[] agrs){
        Personal p=new Personal();
        p.name="白羽";
        p.age=-18;
        p.speak();
    }
}
