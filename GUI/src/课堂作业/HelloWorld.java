package 课堂作业;

import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args){
        String s="HelloWorld";
        char[] c=s.toCharArray();
        StringBuffer buffer=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
            if(c[i]>='A'&&c[i]<='Z'){
                buffer.append(String.valueOf(c[i]).toLowerCase());
            }
            else if(c[i]>='a'&&c[i]<='z'){
                buffer.append(String.valueOf(c[i]).toUpperCase());
            }
        }
        System.out.println("");
        System.out.println(buffer.toString());
    }
}
