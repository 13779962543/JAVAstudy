package Thread.demo01;

public class Race implements Runnable{

    //胜利者
    private static String winner;

    @Override
    public void run(){
        for(int i=0;i<101;i++){

            //模拟兔子休息
            if(Thread.currentThread().getName().equals("兔子")&& i%10==0)
            {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag=gameOver(i);
            if(flag){
                break;
            }

            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }
    //判断是否完成比赛
    private boolean gameOver(int steps){
        //判断是否有胜利者
        if(winner!=null){
            return true;
        }else {
            if(steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Race race=new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
