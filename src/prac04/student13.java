package prac04;
public class student13{

    public void introduce(String name,int id,int score){
        System.out.println("我叫" + name + ", 学号" + id + ", 我考了" + score);
    }
    public void study(){
        System.out.println("我爱学习");

    }
}
class TestStunent{
    public static void main(String[] args){
    student13 stu=new student13();
    stu.study();
    stu.introduce("xibai",2006030422,90);
    }
}
