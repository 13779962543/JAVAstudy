package study05;

class Prime {
    public static void main(String args[]) {
        java.util.Scanner input_obj=new java.util.Scanner(System.in);
        System.out.println("请从键盘输入MAX=");
        final int MAX=input_obj.nextInt();
        //false为质数，true为非质数
        //声明后若没有给定初值，则其默认值为false
        boolean prime[] = new boolean[MAX];
        prime[0] = true;  //0为非质数
        prime[1] = true;  //1为非质数
        int num = 2, i;
        //将1~MAX中不是质数者逐一过滤掉，以此方法找到所有的质数
        while (num < MAX) {
            if (!prime[num]) {
                for (i = num + num; i < MAX; i += num) {
                    if (prime[i]) continue;
                    prime[i] = true;//设置true，代表此数为非质数
                }
            }
            num++;
        }
        //打印1~MAX间的所有质数\
        System.out.println("1到"+MAX+"间的所有质数:");
        for(i=2,num=0;i<MAX;i++)
        {
            if(!prime[i]){
                System.out.println(i+"\t");
                num++;
            }
        }
        System.out.println("\n质数总数="+num+"个");
    }
}