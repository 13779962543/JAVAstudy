package 课后习题.第五章;

import java.util.Random;
public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = 20 + rand.nextInt(11);
            System.out.println(num);
        }
    }
}