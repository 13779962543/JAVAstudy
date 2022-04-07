package day01;

import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        //读取密码,实现控制台输入密码
//        Console cons=System.console();
//        String username=cons.readLine("Username：");
//        char[] passwd=cons.readPassword("Password");
//        System.out.println(username);


       Scanner in=new Scanner(System.in);

       System.out.println("What is your name?");
       String name=in.nextLine();

        System.out.println("How old are you?");
        int age=in.nextInt();
        System.out.println("Hello, "+name+". Next year ,you'll be "+(age+1)+" years old.");

    }
}
