package Thread.demo01;


//创建线程方式，继承Thread类，重写run方法，调用start开启线程
//总结：注意，线程开启不一定立即执行，由CPU调度执行
public class TestThread01 extends Thread{
    @Override
    public void run(){
        //run方法线程
        for(int i=0;i<20;i++){
            System.out.println("我在看代码--"+i);
        }
    }
    public static void main(String[] args){
        //创建一个线程对象
        TestThread01 testThread01 =new TestThread01();
        //调用sort方法开启线程
        testThread01.start();
        //main线程，主线程
        for(int i=0;i<200;i++){
            System.out.println("我在学习多线程--"+i);
        }
    }
}
