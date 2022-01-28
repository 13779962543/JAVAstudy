package study02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请你输入一个字符串:");
        String datas=scanner.nextLine();
        //定义一个Map集合，键是每个字符，值是出现的次数
        Map<Character, Integer> infos=new LinkedHashMap<>();
        //遍历字符串中的每个字符
        for(int i=0;i<datas.length();i++){
            //取出当前索引的字符
            char ch=datas.charAt(i);
            //拿着这个字符去Map集合中看是否有这个字符建，有说明之前统计过，其值+1
            //没有这个字符键，说明该字符是第一次统计，直接存入该字符+1
            if(infos.containsKey(ch)) {
                //说明这个字符之前出现过
                infos.put(ch, infos.get(ch) + 1);
            }else{
                //说明这个字符第一次出现，直接存入a=1
                infos.put(ch,1);
            }
        }
        System.out.println("结果:"+infos);
    }
}
