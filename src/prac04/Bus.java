package prac04;

public final class Bus extends Car {
    int capacity;
    public Bus(){
        capacity=20;
        System.out.println("执行公交车类的无参构造方法");
    }
    public Bus(int capacity,int speed){
        this.speed=speed;
        this.capacity=capacity;
        System.out.println("执行公交车类的有参构造方法");
    }
    public void print(){
        System.out.println("速度为："+speed+"乘客为："+capacity);
    }

}