package prac04;

public class student02 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");

            }
            //使用println方法控制外层循环进行换行
            System.out.println("");
        }
    }
}
