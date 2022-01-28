import java.io.IOException;

//演示各种语句综合应用
public class Je020501 {
    public static void main(String args[]){
        char ch='5';
        int i,m,n,x,y;
        long sum,fact;
        while(ch!='0'){
            System.out.println("1.输出1+2+...+n的结果");
            System.out.println("2.输出1*2*...*n的结果");
            System.out.println("3.输出两个随机整数的最大值");
            System.out.println("4.求使得1+2+...+n的值大于p的最小n值");
            System.out.println("5.求m和n的最大公约数和最小公倍数");
            System.out.println("0.退出系统");
            System.out.println("选择[0,1,2,3,4,5]");
            try{
                ch=(char)System.in.read();
            }catch(IOException e){
             //此出写产生输入错误的处理代码
                    System.out.println(e);
            }
            long p;
            switch(ch){
                case '1':
                    n=(int)(Math.random()*100);
                    System.out.println("sum(1.."+n+")="+sum(n));
                    break;
                case '2':
                    n=(int)(Math.random()*20);
                    System.out.println(n+"!="+fact(n));
                    break;
                case '3':
                    x=(int)(Math.random()*100);
                    y=(int)(Math.random()*100);
                    System.out.println("max("+x+","+y+")="+max(x,y));
                    break;
                case '4':
                    p=100+(int)(Math.random()*10000);
                    System.out.println("(1+2+...+n)>="+p+"的最小值n="+minN(p));
                    break;
                case '5':
                    m=10+(int)(Math.random()*1000);
                    n=10+(int)(Math.random()*1000);
                    System.out.println(m+"和"+n+"的最大公约数="+max1(n,m));
                    System.out.println(m+"和"+n+"的最大公倍数="+m*n/max1(n,m));
                    break;
                case '6':
                    System.out.println("退出程序....");
                    break;
            }
        }
    }
    static long sum(int n){//sum=1+2+..+n
           long sum1=0;
           int i;
           for(i=1;i<=n;i++)sum1=sum1+i;
           return sum1;
    }
    static long fact(int n){//fact=1*2*..*n
           long fact1=1;
           int i;
           for(i=1;i<=n;i++)fact1=fact1*i;
           return fact1;
    }
    static int max(int x,int y){//返回x与y的最大值
        return x>y?x:y;
    }
    static int minN(long m){//返回使得1+2+...+n之和大于m的最小值
        long sum=0;
        int n=0;
        while(sum<m)
        {
            sum=sum+n;n=n+1;
        }
        return n;
    }
    static int max1(int n,int m){//返回x与y的最大公约数
        int temp,r;
        if(n<m)//把大数放在n中，把小数放在m中
        {temp=n;n=m;m=temp;}
        while(m!=0){
            r=n%m;
            n=m;
            m=r;
        }
        return n;
    }
}
