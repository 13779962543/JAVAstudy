//演示 switch case
public class Je020403 {
    public static void main(String args[]){
        int score=88,n=0;
        String str="";
        n=score/10;
        switch(n) {
            case 9:
            case 10:
                str = "优秀";
                break;
            case 6:
                str = "及格";
                break;
            case 7:
                str = "中等";
                break;
            case 8:
                str = "良好";
                break;
            default:
                str = "不及格";
                break;
        }
        System.out.println("成绩"+score+"的等级为"+str);
    }
}
