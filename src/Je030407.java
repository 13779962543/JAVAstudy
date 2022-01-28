//演示引用赋值
class Point{
    int x,y;
    Point(){
        x=67;y=10;
    }
    Point(int x, int y){
        this.x=x;this.y=y;
    }
    void showXY(){
        System.out.println("点(x,y)为"+"("+x+","+y+")");
    }
}
public class Je030407 {
    public static void main(String args[]){
        Point p1=new Point();
        Point p2=new Point(6, 18);
        p1.showXY();
        p2.showXY();
        p1=p2;
        p1.showXY();
        p2.showXY();
    }
}
