package day03;

interface MS{
    void start();
}
class MaoXian implements MS{
    public void start(){
        System.out.println("开始冒险游戏");
    }
}
class ShengCun implements MS{
    public void start(){
        System.out.println("开始生存游戏");
    }
}
class MiNi implements MS{
    public void start(){
        System.out.println("开始迷你游戏");
    }
}
class OnLine implements MS{
    public void start(){
        System.out.println("开始在线游戏");
    }
}
class Game{
    public void On(MS m){
        m.start();
    }
}
public class Test02 {
    public static void main(String[] args){
        Game game=new Game();
        MS m1=new OnLine();
        game.On(m1);
    }
}
