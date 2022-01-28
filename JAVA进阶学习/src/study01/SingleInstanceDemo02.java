package study01;

public class SingleInstanceDemo02 {
    public static void main(String[] args){
        SingleInstance02 s1=SingleInstance02.getInstance();
        SingleInstance02 s2=SingleInstance02.getInstance();
        System.out.println(s1==s2);

    }
}
    //懒汉单例设计一个单例模式的类
    class SingleInstance02{
        //2.定义一个静态成员变量用于存储一个对象(懒汉单例不能直接创建对象，必须需要的时候才创建)
        public static SingleInstance02 ins;
        //1.构造器私有
        private SingleInstance02(){

        }
        //3.通过方法返回一个对象，不存在对象才创建一个返回
        public static SingleInstance02 getInstance(){
            if(ins==null){
//                第一次来取对象，创建一个对象
                ins=new SingleInstance02();
            }
        return ins;
    }
}
