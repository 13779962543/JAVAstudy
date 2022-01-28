package study02;

public class RegexDemo {
    public static void main(String[] args){
        System.out.println(chechQQRegex("161616"));
    }
    //用正则表达式
    public static boolean chechQQRegex(String qq){

        return qq!=null && qq.matches("\\d{4,}");
    }

    //演示不用正则表达式
    public static boolean chectQQ(String qq) {
        //判断是否为null，或者是否为空
        if (qq == null) {
            return false;
        } else {
            //判断长度是否
            if (qq.length() >= 4) {
                //判断是否全是数字
                //先定义一个变量存储最终效验码的结果
                boolean rs = true;//默认合法
                //遍历字符串的每个字符
                for (int i = 0; i < qq.length(); i++) {
                    char ch = qq.charAt(i);
                    if (ch < '0' || ch > '9') {
                        rs = false;
                    }
                }
                return rs;
            } else {
                return false;
            }
        }
    }
}
