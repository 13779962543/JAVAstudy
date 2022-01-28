// 演示递归的使用
class TestRecursion {
    int sum(int n) {
        if (n == 0) return 0;
        else return sum(n - 1) + n;
    }

    int factorial(int n) {
        if (n == 0) return 1;
        else return factorial(n - 1) * n;
    }
}
public class Je030512 {
    public static void main(String args []){
        TestRecursion obj=new TestRecursion();
        System.out.println("sum(n)=1+2+...+n="+obj.sum(5));
        System.out.println("n!=1*2*...*n="+obj.factorial(5));
}
}