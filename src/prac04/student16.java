package prac04;
class A{
    String p1;
    int p2;
    static String p3;
    static{
        p3="静态";
    }
    public A(){
        p3="无参";
    }
    public A(String p1,int p2){
        this();
        this.p1=p1;
        this.p2=p2;
    }
    public String setP1(String p1){
        this.p1=p1;
        return p1;
    }
    public void setP2(int p2){
        this.p2=p2;
    }
    public static void setP3(String p3){
        A.p3=p3;
    }
    public void mA(){
    System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
    }
}
