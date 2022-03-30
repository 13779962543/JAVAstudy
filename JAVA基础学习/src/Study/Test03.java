package Study;

import java.util.Scanner;
/**
 * java字符串反转
 * 例：输入1234   输出4321
 *     输入qwer    输出rewq
 * */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String str1=rev(str);
        System.out.println(str1);
    }
    //利用数组遍历方法
    public static String rev(String str){
        char[] array_char=str.toCharArray();
        String rex="";
        for(int i=array_char.length-1;i>=0;i--){
            rex+= array_char[i];
        }
        return rex;
    }
    //利用StringBuilder的reverse方法
    public static String rev1(String str){
        StringBuilder sb=new StringBuilder(str);
        String rex=sb.reverse().toString();
        return rex;
    }
}

