package 课堂作业;

public class DangerException extends Exception{
    String message;
    DangerException(String n)
    {
        super(n);
    }
    public DangerException()
    {
        super();

    }
}
