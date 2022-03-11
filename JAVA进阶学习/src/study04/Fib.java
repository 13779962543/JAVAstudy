package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
递归法求斐波那契
动态规划法
 */
class Fib{
    public static void main(String[] args)throws Exception
    {
        int num;
        String str;
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("使用递归算法计算斐波那契数列\n");
        System.out.println("请输入一个整数:");
        str=buf.readLine();
        num=Integer.parseInt(str);
        // 开始时间
        long stime = System.currentTimeMillis();
        // 执行时间（1s）
        Thread.sleep(1000);
        if(num<0)
            System.out.println("输入的数字必须大于0\n");
        else
            System.out.println("正在计算...");
            System.out.println("Fibonacci("+num+")="+Fibonacci(num)+"\n");
        // 结束时间
        long etime = System.currentTimeMillis();
        // 计算执行时间
        System.out.printf("执行时长：%d 毫秒.", (etime - stime));
    }

//    public static int Fibonacci(int n)
//    {
//        if(n==0)//第0项为0
//            return (0);
//        else if(n==1) //第一项为2
//            return (1);
//        else
//            return (Fibonacci(n-1)+Fibonacci(n-2));
//        //递归调用函数:第n项为n-1与n-2项之和
//    }
public static int output[]=new int[1000];//fibonacci的暂存区
    public static int Fibonacci(int n)
    {
        int result;
        result=output[n];
        if(result==0) {
            if (n == 0)//第0项为0
                return (0);
            else if (n == 1) //第一项为2
                return (1);
            else
                return (Fibonacci(n - 1) + Fibonacci(n - 2));
            //动态规划调用函数:第n项为n-1与n-2项之和
        }
        output[n]=result;
        return result;
    }
}




