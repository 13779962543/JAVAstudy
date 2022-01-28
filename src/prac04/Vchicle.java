package prac04;

public class Vchicle {
    private int capacity;
    public Vchicle(){
        capacity=2;
        System.out.println("执行交通工具类的无参构造方法");
    }
    public Vchicle(int capacity){
        this.capacity=capacity;
        System.out.println("执行交通工具类的有参构造方法");

    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void print(){
        System.out.println("乘客："+capacity);
    }
}
