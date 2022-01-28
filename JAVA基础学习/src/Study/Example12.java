package Study;

public class Example12 {
    public static void main(String[] args){
        int[] arr={4,1,6,8,7,9,5};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("数组arr中的最大值是："+max);
    }
}
