package 课后习题.第六章;

import java.util.*;
public class Test03 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new MyComparator());
        map.put("1", "Lucy");
        map.put("2", "Lucy");
        map.put("3", "John");
        map.put("4", "Smith");
        map.put("5", "Amanda");
        for (Object key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String ele1 = (String) obj1;
        String ele2 = (String) obj2;
        return ele2.compareTo(ele1);
    }
}