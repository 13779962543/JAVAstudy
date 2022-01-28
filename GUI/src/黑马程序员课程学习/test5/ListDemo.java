package 黑马程序员课程学习.test5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        //创建list集合对象
        List<Student> list =new ArrayList<Student>();

        //创建学生对象
        Student s1=new Student("小白",30);
        Student s2=new Student("小紫",31);
        Student s3=new Student("小黑",32);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器，集合特意的遍历方法
        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");

        //普通for的方式，带有索引的遍历
        for(int i=0;i<list.size();i++){
            Student s=list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");

        //增强for，最方便的遍历方式
        for(Student s:list){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
