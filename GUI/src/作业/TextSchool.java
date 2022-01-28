package 作业;

public class TextSchool {
    public static void main(String[] args){
        School ter=new Teacher("123456789","小白",2002,9,"老师","讲师",2021);
        School stu=new Student("2006030422","吴祥波",2001,8,"计算机","软件",202010,"小白");
        ter.print();
        stu.print();
    }
}
