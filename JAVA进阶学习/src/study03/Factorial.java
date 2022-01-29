package study03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("输入一个数字，求阶乘");
        int n = new Scanner(System.in).nextInt();
        f(n);
    }

    public static void f(int n) {
        if (n < 0) {
            System.out.println("负数不可求阶乘");
            return;
        }
        if (n == 0) {
            System.out.println("0的阶乘是1");
            return;
        }
        long r = n;
        for (int i = n - 1; i >= 1; i--) {
            r *= i;
        }
        System.out.println(n + "的阶乘为" + r);
    }
}