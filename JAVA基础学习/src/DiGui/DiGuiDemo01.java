package DiGui;

import java.io.InputStream;
import java.util.Scanner;

public class DiGuiDemo01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想计算的阶乘和");
        Integer number=sc.nextInt();
        int result=f(number);
        System.out.println(number+"的阶乘是"+result);
    }
        public static int f(int n){
            if(n==1){
                return 1;
            }else{
                return n*f(n-1);
        }
    }
}
