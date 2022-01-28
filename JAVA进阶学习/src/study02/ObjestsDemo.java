package study02;

/*
Objects的方法:
1.public static boolean equals(Objects a, Objects b)
--比较两个对象的
--底层进行非空判断，从而可以避免空指针异常
2.public static boolean inNull(Objects obj)
--判断变量是否为null,为null返回true，反之
 */

import java.util.Objects;

public class ObjestsDemo {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
    }
}
