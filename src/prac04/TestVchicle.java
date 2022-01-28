package prac04;

public class TestVchicle {
    public static void main(String[] args){
        Car car=new Car();
        for(int n=0;n<=50;n++){
            car.speedUp();
        }
        for(int m=0;m<=30;m++){
            car.speedDown();
        }
        car.print();
        Bus bus=new Bus(100,299792458);
        bus.print();
        }
}
