package 黑马程序员课程学习.test7;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        //创建Arraylist集合对象
        ArrayList<Student> array=new ArrayList<Student>();

        Student s1=new Student("小白",20);
        Student s2=new Student("小红",21);
        Student s3=new Student("小黑",22);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        //迭代器，集合持有的遍历方法
        Iterator<Student> it=array.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("----------");

        //普通for
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("---------");

        //增强for
        for(Student s: array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
