package prac04;

public class student05 {
    public static void main(String args[]) {
        int tem = 32;
        if (tem >= 35) {
            System.out.println("温度为" + tem + "太热了，开空调");
        } else if (tem >= 25 && tem < 35) {
            System.out.println("温度为" + tem + "有点热");
        } else if (tem >= 10 && tem < 25) {
            System.out.println("温度为" + tem + "正合适");
        } else if (tem < 10) {
            System.out.println("温度为" + tem + "有点冷，要多穿衣服");
        }
    }
}