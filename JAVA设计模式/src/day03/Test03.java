package day03;

class MovieTicket{
    protected static double price;
    public MovieTicket( double p){
        price = p;
    }
        public double calculate (DZ d){
        return d.js();
    }
}
interface DZ{
    double js();
}
class Student extends MovieTicket implements DZ{

    public Student(double p) {
        super(p);
    }

    @Override
    public double js(){
            return price*0.8;
        }
    }
class Children extends MovieTicket implements DZ{

    public Children(double p) {
        super(p);
    }

    @Override
    public double js(){
            if(price>=20){
                price=price-10;
            }
            return price;
        }
}
class VIP extends MovieTicket implements DZ{

    public VIP(double p) {
        super(p);
    }

    @Override
    public double js(){
            return price*0.5;
        }
}

public class Test03 {
    public static void main(String[] args, double p){
        DZ d=new Children(p);
        MovieTicket mt=new MovieTicket(40);
        System.out.println(mt.calculate(d));
    }
}


