package 课堂作业;

public class Testxb {
    public static void main(String[] args) {
        char a = '1';
        char b = '2';

        System.out.println("1" + "+" + "2" + "=" +a+b);

        String stra = String.valueOf(a);
        int numa = Integer.parseInt(stra);
        String strb = String.valueOf(b);
        int numb = Integer.parseInt(strb);
        System.out.println("1" + "+" + "2" + "=" + (numa+numb));
    }
}
