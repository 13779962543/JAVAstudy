//演示算数
public class Je020301 {
    public static void main(String args[]){
        int x=5,y,z;
        z=x;
        y=++x;//line5
        System.out.println("y="+y+" x="+x);
        x=z;
        y=x++;
        System.out.println("y="+y+" x="+x);
    }
}
