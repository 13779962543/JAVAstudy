package 课堂作业;

import java.util.Random;

public class StringPractice {
    public static void main(String[] args) {
        Random random = new Random();
        String string = "";
        int printLength = 10;
        String[] alphabet = {"a", "b", "c", "d", "e", "d", "s", "f", "g", "o", "p", "z", "a", "m", "n",
                "p", "f", "n", "v", "u", "e","p", "f", "n", "v", "u", "e","p", "f", "n", "v", "u", "e"};
        for (int j = 0; j < 100; j++) {
            string = string + alphabet[random.nextInt(26)];

        }
        System.out.println(string);
        System.out.println("随机生成的字符串为");
        for (int m = 0; m < (100 / printLength); m++) {
            System.out.println(string.substring(m * 10, (m + 1) * 10));
        }

        System.out.println(string.length());
        System.out.println("字符串中第一个字符:" + string.charAt(0));
        System.out.println("字符串中最后一个字符:" + string.charAt(99));
        System.out.println(string.replaceAll("23","s"));
        System.out.println(string.charAt(24-1) + "" + string.charAt(39-1) + "" + string.charAt(35-1)
                + "" + string.charAt(88-1) + "" + string.charAt(98-1) + "" + string.charAt(13-1) + "" + string.charAt(59-1));
        System.out.println(string.replaceAll("a",""));

    }
}

