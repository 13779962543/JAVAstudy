package Study;

public class Example17 {
    //使用递归实现1-nd的和
    public static int getSum(int n){
        if (n==1){
            return 1;
        }
        int temp =getSum(n-1);
        return temp+n;
    }
    public static void main(String[] args){
        int sum=getSum(4);
        System.out.println("sum="+sum);
    }
}
