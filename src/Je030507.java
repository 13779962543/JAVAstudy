//演示return语句返回值
public class Je030507 {
    public static void main(String args[]){
        int v1,v2;
        v1=10;v2=12;
        System.out.println("max("+v1+","+v2+")="+max(v1,v2));
    }
    static int max(int x,int y)
    {
        if(x>y)return x;
        else return y;
    }
}
