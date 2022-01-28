public class Je030506 {
    public static void main(String args[]){
        int a[]=new int[6];
        for(int i=0;i<a.length;i++)
            a[i]=i;
        for(int i=0;i<a.length;i++)
            System.out.println("a["+i+"]="+a[i]);
        addN(a,10);
        for(int i=0;i<a.length;i++)
            System.out.println("a["+i+"]="+a[i]);
    }
    static void addN(int b[],int N)
    {
        for(int i=0;i<b.length;i++)
            b[i]=b[i]+N;
    }
}
