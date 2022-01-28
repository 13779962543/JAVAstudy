package 作业;

public class Mypoint{
    private double x;
    private double y;
    public Mypoint(){
        this.x=0;
        this.y=0;
    }
    public Mypoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return this.x;
    }
    public void setX(double x){
        this.x=x;
    }

    public double getY() {
        return this.y;
    }
    public void setY(double y){
        this.y=y;
    }


    public static double getDistance(Mypoint p1,Mypoint p2){
        return Math.sqrt((p1.getX()- p2.getX())*(p1.getY()- p2.getY())+(p1.getY()-
                p2.getY())*(p1.getY()-p2.getY()));

    }
    public double getDistance(Mypoint p){
        return getDistance(this,p);
    }
    public double getDistance(double x,double y){
        Mypoint m=new Mypoint();
        m.setX(x);
        m.setY(y);
        return getDistance(this,m);
    }
}