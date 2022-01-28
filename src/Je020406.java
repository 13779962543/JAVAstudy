//演示不带标号continue语句的使用
public class Je020406 {
    public static void main(String args[]){
        int n=0,i,num=0;
        for(i=1;i<=50;i++){
            num=(int)(Math.random()*100);
            //System.out,println("num="+num);
        if(num%5==0){
            n=n+1;
            continue;
        }
        System.out.println(num+"不能被5整除！！！");
        }
       System.out.println("50个随机数中被5整除的数的个数="+n);
    }
}
