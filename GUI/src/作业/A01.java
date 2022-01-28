package 作业;

interface Animal{
    int ID=1;
    void breathe();
    default void getType(String type){
        System.out.println("该动物属于:"+type);
    }
    static int getID(){
        return Animal.ID;
    }
}

interface LandAnimal extends Animal{
    void run();
}

class Dog implements LandAnimal{
    public void breathe(){
        System.out.println("狗在呼吸");
    }
    public void run(){
        System.out.println("够在陆地上跑");
    }
}
public class A01 {
    public static void main(String[] args){
        System.out.println(Animal.getID());
        Dog dog=new Dog();
        System.out.println(dog.ID);
        dog.breathe();
        dog.getType("犬科");
        dog.run();
    }
}
