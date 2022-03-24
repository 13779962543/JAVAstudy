package filedemo;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args){
        //method1();
        //method2();
        //method3();

    }
    private static void method3(){
        //File(File parent,String child)    从父抽象路径名和子路径名字符串创建新的File实例
        File file1=new File("D:\\txt");
        String path="a.txt";
        File file=new File(file1,path);
        System.out.println(file);
    }
    private static void method2() {
        //File(String parent,String child)  从父路径名字符串和子路径名字符串创建新的File实例
        String path1="D:\\txt";
        String path2="a.txt";
        File file=new File(path1,path1);
        System.out.println(file);
    }

    private static void method1() {
        //File (String pathname)    通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        String path="D:\\problem.txt";
        File file=new File(path);
        //为什么要把字符串表示形式的路径变成File对象
        //为了使用File里面的放法
    }
}
