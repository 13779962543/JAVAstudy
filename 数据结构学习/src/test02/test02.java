package test02;

public class test02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 21, 51, 22, 12, 64};
        for (int i = 0; i < arr.length; i++) {
            int min = i;//最小元素的下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;//找最小值
                }
            }
            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
