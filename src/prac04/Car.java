package prac04;

public class Car extends Vchicle{
    int speed;
    public Car(){
        speed=0;
        System.out.println("执行汽车类的无参构造方法。");
    }
    public Car(int capacity,int speed){
        super(capacity);
        this.speed=speed;
        System.out.println("执行汽车类的有参构造方法。");
    }
    public int speedUp(){
        speed+=1;
        return speed;
    }
    public int speedDown(){

        speed-=1;
        return speed;
    }
    public void print(){
        System.out.println("速度为："+speed+"乘客为："+getCapacity());
    }

}

