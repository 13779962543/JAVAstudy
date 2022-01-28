package Study;

public class Example13 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        //冒泡排序前，先循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        //进行冒泡排序
        //外层循环定义需要比较的轮数（两数对比，要比较n-1）
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}