package com.yash.Heaps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int heap_Array[] = {6, 2, 9, 4, 10, 15, 1, 13};
        System.out.println("Input Array:" + Arrays.toString(heap_Array));
        //call HeapSort method for given array
        HeapSort hs = new HeapSort();
        hs.heap_sort(heap_Array);
        //print the sorted array
        System.out.println("Sorted Array:" + Arrays.toString(heap_Array));
    }
}
