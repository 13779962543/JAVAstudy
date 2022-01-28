public class Je020402 {
    public static void main(String args[]){
        int score=88;
        String str="E";
        if(score>=90&&score<=100)
            {str="A";}
        else if(score>=80&&score<=89)
               {str="B";}
            else if(score>=70&&score<=79)
                    {str="C";}
                else if(score>=60&&score<=69)
                         {str="D";}
        System.out.println("成绩为"+str);
    }
}
