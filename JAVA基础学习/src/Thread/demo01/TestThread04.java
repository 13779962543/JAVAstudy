package Thread.demo01;

//多个线程同时炒作同一个对象
//买火车票的例子
public class TestThread04 implements Runnable{

    //票数
     private int tickedNums=10;


    @Override
    public void run(){
        while(true){
            if(tickedNums<=0){
                break;
            }//模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickedNums+"票");
        }
    }
    public static void main(String[] args){
        TestThread04 ticket=new TestThread04();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"小白").start();
    }

}
