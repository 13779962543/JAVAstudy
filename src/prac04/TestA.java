package prac04;

public class TestA {
    public static void main(String[] args) {
        A a1 = new A("小白", 22);
        a1.mA();
        A a2 = new A();
        a2.setP1("小白");
        a2.setP2(20);
        a2.mA();

    }
}
