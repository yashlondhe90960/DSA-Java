package com.yash.arrays;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={1,3,28,6,18};
        Rev(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }

    }

    static void swap(int[] arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
