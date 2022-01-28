package Study;

public class Example11 {
    public static void main(String[] args){
        //第一种方式定义数组
        int[] ids=new int[100];
        System.out.println("ids[0]="+ids[0]);
        //为数组指定元素进行初始化赋值
        ids[0]=2500;
        System.out.println("ids[0]"+ids[0]);
        System.out.println("================");
        //第二种方式定义数组
        String[] names=new String[]{"张三","tom","jack"};
        System.out.println("name[0]="+names[0]);
        //为数组定义时指定的初始值进行修改
        names[0]="李四";
        System.out.println("name[0]="+names[0]);
        //第三种方式定义数组
        Object[] object={"张三","tom","jack"};
        System.out.println("object[0]="+object[0]);
        object[0]="李四";
        System.out.println("object[0]="+object[0]);
    }
}
