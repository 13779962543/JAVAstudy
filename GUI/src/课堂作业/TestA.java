package 课堂作业;

public class TestA {

    public static void main(String[] args) {

        Machine machine=new Machine();
        Goods good=new Goods();
        good.SetDanger(true);
            try
            {
                machine.checkBag(good);
            }
            catch(DangerException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
