package 课堂作业;

public class OuterClass{
    static String name="张三";
    int age=30;

    public OuterClass(){
        System.out.println("1)外部类的构造方法运行了。");
    }
    public class MemberInner{
        public MemberInner(){
            System.out.println("2)成员内部类的构造方法运行了。");
        }
        public void testMemberInner(){
            System.out.println("3)这是测试成员内部类的成员方法。");
        }
    }
    public static class StaticInner{
        public StaticInner(){
                System.out.println("4)这是静态内部类的构造方法运行了。");
            }
           public void testdStatic(){
                System.out.println("5)这是静态内部类中的非静态方法。");
           }
        public static void testStatic(){
            System.out.println("6)这是静态内部类里的静态方法。");
        }
        }
    public void testMethodClass(){
        class MethodInnerClass{
            public MethodInnerClass(){
                System.out.println("7)方法内部类中的构造方法运行了。");
            }
            public void testMethod(){
                System.out.println("8)这是方法内部类中的方法。");
            }
    }MethodInnerClass mic = new MethodInnerClass();
        mic.testMethod();
    }
}

