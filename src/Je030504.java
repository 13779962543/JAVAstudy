class C{
    int square(int x){
        x=x*x;
        return x;
    }
}
public class Je030504 {
    public static void main(String args[]){
        int y,z;
        C a=new C();
        y=10;
        z=a.square(y);
        System.out.println("y="+y+"...z="+z);
    }
}
