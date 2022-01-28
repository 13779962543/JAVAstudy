package 黑马程序员课程学习.test3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("nihao");

        System.out.println(list);

        //迭代器的方式遍历
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }
}
