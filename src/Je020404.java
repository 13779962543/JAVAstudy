
public class Je020404 {
    public static void main(String args[]){
        int n=10,m=5;
        System.out.println("for 循环求解下结果="+sum1(n,m));
        System.out.println("while 循环求解下结果="+sum2(n,m));
        System.out.println("do whlie 循环求解下结果="+sum3(n,m));
    }
    //演示for循环应用
public  static long sum1(int n,int m){
        int i=0;
        long sum=0;
        for(i=1;i<=n;i++){
            if(i%m==0)
            {
                sum=sum+i;
            }
        }
        return sum;
}
//演示while循环应用
public  static long sum2(int n,int m){
        int i=0;
        long sum=0;
        while(i<=n){
            if(i%m==0)
            {
                sum=sum+i;
            }
            i=i+1;
        }
        return sum;
}
//演示do while循环应用
public  static long sum3(int n,int m){
        int i=0;
        long sum=0;
        do {
            if(i%m==0)
            {
                sum=sum+i;
            }
            i=i+1;
        }while(i<=n);
        return sum;
}
}
