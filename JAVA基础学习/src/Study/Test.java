package Study;

public class Test {
    public static void main(String[] args){
        for(int k=2;k<=100;k++) {
            boolean flag = true;
            for(int i =2;i<=k-1;i++) {
                if(k%i == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(k+"是质数");
            }
        }
    }
}
