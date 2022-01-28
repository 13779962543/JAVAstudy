package prac04;

public class student06 {
        public static void main(String[] args) {
            double n = 1;
            double sum = 0;
            while (true) {
                sum += (1 / n);
                if (sum > 10) {
                    System.out.println("n=" + n);
                    break;
                }
                n++;
            }
        }
    }

