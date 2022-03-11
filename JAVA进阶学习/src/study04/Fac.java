package study04;

class Fac {
    public static void main(String[] args)throws Exception
    {
        int sum=1;

        java.util.Scanner input_obj=new java.util.Scanner(System.in);
        System.out.println("请从键盘输入n=");
        int n=input_obj.nextInt();

        //以for循环计算 n！
        for(int i=1;i<n+1;i++){
            for(int j=i;j>0;j--)
                sum=sum*j;  //sum=sum*j
            System.out.println(i+"!="+sum);
            sum=1;
        }
    }
}
