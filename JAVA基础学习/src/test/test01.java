package test;

import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.logging.Logger;

public class test01 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        String number=sc.nextLine();
        try{
            int result=Integer.parseInt(number);
            System.out.println("输出的数字为:"+result);
        }catch (NumberFormatException e){
            System.out.println("输入的数字有误请重新输入");
        }

    }
}
