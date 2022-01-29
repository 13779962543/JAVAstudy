package study03;

import java.io.OutputStream;
import java.util.Scanner;

public class GetMaxNumber {
    public static void main(String[] args){
        System.out.println("请输入第一个数字");

        int a=new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数字");
        int b=new Scanner(System.in).nextInt();
        System.out.println("请输入第三个数字");
        int c=new Scanner(System.in).nextInt();
        //运用三元运算
        int max=a>b?a:b;
        max=max>c?max:c;
        System.out.println("三个数中最大的是:"+max);
    }
}
