package test02;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        Integer nb=sc.nextInt();
        int middle = binarySearch(nb, arr, 0, arr.length - 1);
        System.out.println(arr[middle]);

    }

    public static int binarySearch(int key, int[] array, int left, int right) {
        if (key < array[left] || key > array[right] || left > right) {
            return -1;
        }
        //取数组下标的中间值
        int mid = (left + right) / 2;
        if (array[mid] > key) {
            return binarySearch(key, array, left, mid - 1);
        } else if (array[mid] < key) {
            return binarySearch(key, array, mid + 1, right);
        } else {
            return mid;
        }
    }
}
