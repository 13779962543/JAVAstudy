//演示带标号的break ，label
public class Je020405 {
    public static void main(String args[]){
        boolean flag=true;
        lab1:{
            lab2:{
                 lab3:{
                System.out.println("break语句执行前!");
                   if(flag)break lab2;
                 }
                 System.out.println("lab2语句块尾部！");
            }
            System.out.println("lab1语句块尾部!");
        }
    }
}
