package Thread.demo01;

//创建线程方式2，实现runnable接口，重写run方法，执行线程需要丢入到runnable接口实现类，调用start方法
public class TestThread03 implements Runnable {

    @Override
    public void run(){
        //run方法线程
        for(int i=0;i<200;i++){
            System.out.println("我在看代码--"+i);
        }
    }
    public static void main(String[] args){
        //创建一个run接口的实现类对象
        TestThread03 testThread03 =new TestThread03();
        //创建线程对象，通过线程对象来开启我们的线程，代理
        Thread thread=new Thread(testThread03);

        thread.start();
        new Thread(testThread03).start();

        //main线程，主线程
        for(int i=0;i<200;i++){
            System.out.println("我在学习多线程--"+i);
        }
    }
}
