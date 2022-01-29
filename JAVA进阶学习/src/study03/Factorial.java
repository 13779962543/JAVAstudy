package study03;

public class Factorial {
    public static long fact(long n) {
        long r = 1;
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
