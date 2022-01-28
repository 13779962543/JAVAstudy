package Study;

class Animals{
    String name="动物";
    void shout(){
        System.out.println("动物发出了叫声");
    }
}
class Dogs extends Animals{
    String name="犬类";
    void main(){
        super.shout();
    }
    void printName(){
        System.out.println("name="+super.name);
    }
}
public class Example21 {





    public static void main(String[] args){
        Dogs dog=new Dogs();
        dog.shout();
        dog.printName();
    }
}
