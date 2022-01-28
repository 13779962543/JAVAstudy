package study02;

public class ObjectToStringDemo01 {
    public static void main(String[] args){
    Student zs=new Student("张三",21,'男');
    //直接调用tostring方法返回的是对象在内存重点的地址
    System.out.println(zs.toString());
    //tostring可以省略不写
        System.out.println(zs);
    }
}
