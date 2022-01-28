package prac04;

public class student14 {

    public int operation(int x){
        if (x > 0){
            return x + 3;
        }
        else if (x == 0){
            return 0;
        }
        else {
            return x*x-1;
        }
    }
}
class TestSF{
    public static void main(String[] args){
        student14 p = new student14();
        System.out.println(p.operation(-5));
        System.out.println(p.operation(0));
        System.out.println(p.operation(8));
    }
}