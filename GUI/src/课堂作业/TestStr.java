package 课堂作业;

public class TestStr {
    public static void main(String[] args) {
        String s = new String("thzzhiafuzygnbofuuqbfezswjcuwvylnyuaplt" +
                "rkfivdslwhsadyxwcoqtkwfekbfiywpalpwcilqdcrvsjjlbdlxinsprwzeff");
        System.out.println(s.charAt(24-1) + "" + s.charAt(39-1) + "" + s.charAt(35-1)
                + "" + s.charAt(88-1) + "" + s.charAt(98-1) + "" + s.charAt(13-1) + "" + s.charAt(59-1));
        getNums(s);
    }
public static void getNums(String str){
        int[] nums=new int[26];
        for(char i:str.toCharArray()){
            if(i>=97&&i<=123){
                nums[i-97]++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                char j=(char)(i+97);
                System.out.println(j+"出现的次数为"+nums[i]);
            }
        }
}
}
