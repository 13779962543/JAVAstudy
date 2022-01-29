package study03;

import static study03.Factorial.fact;

public class Test {
    public static void main(String[] args){
        if(fact(10)==362800){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
