package 黑马程序员课程学习.test5;

import 课堂作业.MyException;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if (age <= 0) {
//            throw new MyException("年龄不能为负数");
////            System.out.println("年龄不能为负数");
//        } else {
            this.age = age;
        }

    }
//    public void speak(){
//        System.out.println(name+"的年龄为"+age);
//    }
//}