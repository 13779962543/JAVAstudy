package 作业;

class School{
    String id;
    String name;
    int year;
    int month;

    public School(){}
    public School(String id,String name, int year,int month){
        this.id=id;
        this.name=name;
        this.year=year;
        this.month=month;
    }
    public void print(){
        System.out.println("编号："+id+"姓名"+name+"年"+year+"月"+month);
    }
}
class  Teacher extends School{
    String bm;
    String zw;
    int time;

    public Teacher(){

    }
    public Teacher(String id,String name,int year,int month,String bm,String zw,int time){
        super(id,name,year,month);
        this.bm=bm;
        this.zw=zw;
        this.time=time;
    }
    public void print(){
        super.print();
        System.out.println("部门"+bm+"职务"+zw+"签发时间"+time);
    }
}


public class Student extends School{
    String xy;
    String zy;
    int rx;
    String zc;

    public Student(){

    }
    public Student(String id,String name,int year,int month,String xy,String zy,int rx, String zc){
        super(id,name,year,month);
        this.xy=xy;
        this.zy=zy;
        this.rx=rx;
        this.zc=zc;
    }
    public void print(){
        super.print();
        System.out.println("学院"+xy+"专业"+zy+"入学时间"+rx+"注册信息"+zc);
    }

}
