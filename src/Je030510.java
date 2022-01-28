  class D{
    void show(int i,String str){
        System.out.println("第"+i+"参加是"+str);
    }
}
public class Je030510 {
    public static void main(String args[]){
        D d=new D();
        int i;
            for(i=0;i<args.length;i++)
            d.show(i+1,args[i]);
    }
}
