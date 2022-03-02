package study04;

public class ClassLoaderDemo1 {
    public static void main(String args[]){

        //获取系统类加载器
        ClassLoader systemClassLoader=ClassLoader.getSystemClassLoader();
        //获取系统类加载器的父加载器--平台类加载器
        ClassLoader classLoader01=systemClassLoader.getParent();
        //获取平台类加载器的父加载器--启动类加载器
        ClassLoader classLoader02=classLoader01.getParent();

        System.out.println("系统类加载器"+systemClassLoader);
        System.out.println("平台类加载器"+classLoader01);
        System.out.println("启动类加载器"+classLoader02);
    }
}
