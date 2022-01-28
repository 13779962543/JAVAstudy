package Study;

abstract class Animale{
    //定义抽象方法shout()
    public abstract void shout();
}
class Dogl extends Animale{
    public void shout(){
        System.out.println("汪汪...");
    }
}
public class Example22 {
    public static void main(String[] args){
        Dogl dog=new Dogl();
        dog.shout();
    }
}
