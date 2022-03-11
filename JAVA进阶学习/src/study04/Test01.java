package study04;

//枚举法
public class Test01 {
    public static void main(String[] args){
        int x=1;
        int num=1000;
        while (num>=0) {
            num -= x;
            x = x + 1;
        }
        System.out.println(x-1);
    }
}
