package 课堂作业;

public class Machine {
    void checkBag(Goods good) throws DangerException
    {
        if (good.isDanger==true)
        {
            throw new DangerException("危险品");
        }
    }
}