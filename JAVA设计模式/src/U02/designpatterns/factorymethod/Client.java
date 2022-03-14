package U02.designpatterns.factorymethod;

public class Client {
    public static void main(String args[]){
        LoggerFactory factory;
        Logger logger;
        factory=new FileLoggerFactory();
        logger=factory.createLogger();
        Logger.writeLog();
    }
}
