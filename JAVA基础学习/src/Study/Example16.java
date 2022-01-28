package Study;

public class Example16 {
    public static int add01(int x,int y){
        return x+y;
    }
    public static int add02(int x,int y,int z){
        return x+y+z;
    }
    public static double add03(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        //针对求和方法的调用
        int sum1=add01(1,2);
        int sum2=add02(3,4,5);
        double sum3=add03(0.5,0.2);
        //打印求和的结果
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
    }
}
