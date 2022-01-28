package study01;

/*
单例:
单例的意思是一个类永远只存在一个对象，不能创建多个对象
为什么要用单例：
开发中有很多类的对象我们只需要一个，例如虚拟机对象！任务管理器对象！
对象越多越占内存，有些时候只需要一个对象就可以实现业务，单例可以节约内存，提高性能！
如何实现单例？
1.饿汉单例设计模式：
--通过类获取单例对象的时候，对象已经提前做好了！
实现步骤：
1.定义一个单例类
2.把类的构造器私有
2.懒汉单例设计模式:
3.定义一个静态成员变量用于存储一个对象
4.定义一个方法返回单例对象
--通过类获取单例对象的时候发现没有对象才会去创建一个对象
实现步骤：
1.定义一个单例类
2.把类的构造器私有
3.通过方法返回一个对象，不存在对象才创建一个返回
 */
public class SingleInstanceDemo01 {
    public static void main(String[] args) {
        SingleInstance01 s1 = SingleInstance01.getInstance();
        SingleInstance01 s2 = SingleInstance01.getInstance();
        System.out.println(s1 == s2);

    }
}
    //饿汉单例设计一个单例模式的类
    class SingleInstance01{
        //2.定义一个静态成员变量用于储存一个对象(饿汉单例在返回对象的时候，对象要已经做好，所以这里直接创建出来)
        public static SingleInstance01 ins=new SingleInstance01();
        //1.把类的构造器私有,构造器只能在本类中访问
        private SingleInstance01(){

        }
        //        3.提供一个方法返回单例对象
        public static SingleInstance01 getInstance(){
            return ins;
        }
    }

