package 黑马程序员课程学习.test6;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args){
        //创建集合对象
        ArrayList<String> array=new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for(String s:array){
            System.out.println(s);
        }
        System.out.println("--------");
        LinkedList<String> linkedList=new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for(String s:linkedList){
            System.out.println(s);
        }
    }
}
