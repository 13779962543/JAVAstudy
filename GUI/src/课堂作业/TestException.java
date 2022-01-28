package 课堂作业;

public class TestException {
    public static void main(String[] args){
        try {
            exceptionPractice ep = new exceptionPractice();
            System.out.println(ep.arrayExc(9));
        }catch(Exception e){
            System.out.println("捕获的异常信息为:"+e.getMessage());
        }
        good();
    }
    static void good(){
        System.out.println("打印了这句话，说明程序走完了才退出");
    }
}
class exceptionPractice {
    int[] arr = new int[10];

    public exceptionPractice() {
        for (int i = 0; i < 10; i++)
            arr[i] = i * i;
    }

    //下面的方法功能是返回数组元素的值，有没有出现异常的可能？如何处理
    public int arrayExc(int d) throws Exception{
//        try {

            return arr[d];
//        } catch (Exception e) {
//            System.out.println("捕获的异常信息为:" + e.getMessage());
//        }
//        return -1;
    }
}