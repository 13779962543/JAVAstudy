package 课后习题.第三章;

class Student {
    private String name;
    private double grade;
    public Student() {
    }
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class Test01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("小白");
        stu1.setGrade(99);
        Student stu2 = new Student("lisi", 100);
        System.out.println("姓名:"+stu1.getName()+"\n成绩 :"+stu1.getGrade());
    }
}
