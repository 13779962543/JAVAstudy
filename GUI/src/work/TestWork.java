package work;

import java.util.ArrayList;
import java.util.List;

public class TestWork {
    public static void main(String[] args){
        run();
    }
    public static void run(){
        List list1=new ArrayList();
         Worker w1=new Worker("张三",3200);
         Worker w2=new Worker("李四",3000);
         Worker w3=new Worker("王五",4000);
         list1.add(w1);
         list1.add(w2);
         list1.add(w3);
        for(Object obj:list1){
            System.out.println(obj);
        }
        System.out.println("======================================================");
        ArrayList<Worker> list2=new ArrayList<>();
        list2.add(w1);
        list2.add(w2);
        list2.add(w3);
        for(Object obj:list2){
            System.out.println(obj);
        }

    }
}
