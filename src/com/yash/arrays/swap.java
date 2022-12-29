package com.yash.arrays;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,3,29,3,18};
       swap(arr,4,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
