package prac04;

public class Light {
    private int watts;
    private boolean indicator;

    public Light(int watts,boolean indicator){
        this.watts=watts;
        this.indicator=indicator;
    }
    public void setWatts(int watts){
        this.watts=watts;
    }
    public int getWatts(){
        return watts;
    }
    public boolean switchStatus(){
        return indicator;
    }
    public void switchOnOff(){
        indicator=!indicator;
    }
    public void printInfo(){
        System.out.println("长度:"+watts);
        System.out.println("状态:"+(indicator?"开":"关"));
    }
}
class TubeLight extends Light{
    private int tubeLength;
    private String color;

    public TubeLight(int watts,boolean indicator,int tubeLength,String color){
        super(watts,indicator);
        this.tubeLength=tubeLength;
        this.color=color;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("长度:"+tubeLength);
        System.out.println("颜色:"+color);
    }
}
class TestLight{
    public static void main(String[] args){
        TubeLight t1=new TubeLight(32,true,50,"蓝色");
        t1.printInfo();
    }
}
