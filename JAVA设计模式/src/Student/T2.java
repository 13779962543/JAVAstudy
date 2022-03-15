package Student;

interface MyFarm{
    public void Feed(MyAnimal c);
    void eat();
}
interface MyAnimal{
    public void eat();
}
abstract class GMFarm implements MyFarm{
    public void Feed(MyFarm c){
        c.eat();
    }
}
abstract class MNFarm implements MyFarm{
    public void Feed(MyFarm c){
        c.eat();
    }
}

class Dog implements MyAnimal{
    public void eat(){
        System.out.println("小狗吃的饱饱的");
    }
}

class Cow implements MyAnimal{
    public void eat(){
        System.out.println("小狗吃的饱饱的");
    }
}
public class T2 {
    public static void main(String[] args){
        GMFarm gm= new GMFarm() {
            @Override
            public void Feed(MyAnimal c) {

            }

            @Override
            public void eat() {

            }
        };
        MNFarm mn= new MNFarm() {
            @Override
            public void Feed(MyAnimal c) {

            }

            @Override
            public void eat() {

            }
        };
        Cow c=new Cow();
        Dog d=new Dog();
        gm.Feed(c);
        mn.Feed(d);
    }
}
