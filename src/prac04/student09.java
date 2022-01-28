package prac04;

public class student09 {
    public static void main(String[] args) {
        byte a = 1;
        short b = a; //程序把byte类型的变量a自动转换成了short类型
        int c = b; //程序把short类型的变量b自动转换成了int类型
        long d = c; //程序把int类型的变量c自动转换成了long类型
        char i = 'a';
        float j = i+c; //程序把short类型的变量b和char类型的变量i自动转换成了float类型
        j = c+d; //程序把int类型的变量c和long类型的变量d自动转换成了float类型
        double z = j; //程序把float类型的变量j自动转换成了double类型
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("z="+z);
    }
}