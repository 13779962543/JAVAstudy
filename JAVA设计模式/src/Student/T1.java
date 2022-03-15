package Student;

abstract class Operation{
    public int numberA,numberB;
    public abstract void getResult();
}
class Cheng extends Operation{
    public void getResult(){
        int c=super.numberA*super.numberB;
        System.out.println(c);
    }
}

class Jia extends Operation{
    public void getResult(){
        int c=super.numberA+super.numberB;
        System.out.println(c);
    }
}

class Jian extends Operation{
    public void getResult(){
        int c=super.numberA-super.numberB;
        System.out.println(c);
    }
}

class Chu extends Operation{
    public void getResult(){
        int c=super.numberA/super.numberB;
        System.out.println(c);
    }
}

public class T1 {
    public static void main(String[] args)
    {
        Operation op=new Cheng();
        op.numberA=2;
        op.numberB=3;
        op.getResult();
    }
}
