package 课堂作业;

import java.util.*;

public class RandomPradice {
    public void practice(){
        Random a = new Random();
        Random b = new Random();
        int x = a.nextInt(51);
        int y = a.nextInt(51);
        System.out.println(x+"+"+y+"="+"?");
        Scanner d = new Scanner(System.in);
        int c = d.nextInt();
        if(c==(x+y)){
            System.out.println("正确！");
        }
        else{
            System.out.println("错误！");
        }
    }
}
class example{
    public static void main(String[] args) {
        RandomPradice n = new RandomPradice();
        n.practice();
    }
}