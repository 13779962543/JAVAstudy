package prac04;

import java.util.Scanner;
public class student01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入年份：");
        int year=scan.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.print("他是闰年");
        }else
        if(year%400==0){
            System.out.print("他是闰年");
        }
        scan.close();
    }
}
