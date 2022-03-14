package U02.designpatterns.factorymethod;

public class DatabaseLogger implements Logger{
    public void writeLog(){
        System.out.println("数据库日志记录");
    }
}
