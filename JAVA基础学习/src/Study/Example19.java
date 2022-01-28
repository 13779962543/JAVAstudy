package Study;

class Person{
    public Person(){
        System.out.println("无参的构造方法被调用了");
    }
    public Person(int age){
        this();             //调用无参的构造方法
        System.out.println("有参的构造方法被调用了");
    }
}
public class Example19 {
    public static void main(String[] args){
        Person p=new Person(18);        //实例化Person对象 
    }
}
