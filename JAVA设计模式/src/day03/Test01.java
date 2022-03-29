package day03;

class Address{
    String name;
    public Address(String n){
        name=n;
    }
}
abstract class Vehicle{
    public abstract void go(Address a);
}
class Car extends Vehicle{
    public void go(Address a){
        System.out.println("迎着阳光去"+a.name);
    }
}
class Plane extends Vehicle{
    public void go(Address a){
        System.out.println("扇着翅膀去"+a.name);
    }
}
class Train extends Vehicle{
    public void go(Address a){
        System.out.println("冒着烟去"+a.name);
    }
}
class Driver{
    String name;
    public Driver(String d){
        name=d;
    }
    public void drive(Vehicle c,Address a){
        System.out.println(this.name+"开车");
        c.go(a);
    }
}
public class Test01 {
    public static void main(String[] args){
        Address a1=new Address("东北");
        Vehicle c1=new Train();
        Driver d1=new Driver("老张");
        d1.drive(c1,a1);

    }
}
