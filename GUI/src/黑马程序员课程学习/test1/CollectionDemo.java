package 黑马程序员课程学习.test1;

import 黑马程序员课程学习.test5.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args){
        Collection<Student> c=new ArrayList<Student>();
        Student s1=new Student("小白",21);
        Student s2=new Student("小黄",24);
        Student s3=new Student("小黑",22);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it=c.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
