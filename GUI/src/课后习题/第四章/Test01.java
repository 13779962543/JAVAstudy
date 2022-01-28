package 课后习题.第四章;

class Student {
    public String name;
    public int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}
class UnderGraduate extends Student{
    public String degree;
    public UnderGraduate(String name,int age,String degree){
        super(name, age);
        this.degree=degree;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" degree: "+degree);
    }
}
public class Test01{
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 16);
        student.show();
        UnderGraduate underGraduate = new UnderGraduate("lisi", 20, "bechalor");
        underGraduate.show();
    }
}