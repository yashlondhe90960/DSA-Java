package com.yash.Heaps;

import com.yash.BinaryTrees.BinarySearchTree;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class binary_heap {
    private static final int d=2;
    private int[] heap;
    private int heapSize;

    //binary heap constructer
    public binary_heap(int capacity){
        heapSize=0;
        heap=new int[capacity + 1];
        Arrays.fill(heap,-1);
    }

    public boolean isEmpty(){
        return heapSize==0;

    }
    public boolean isFull(){
        return heapSize==heap.length;

    }
    private int parent(int i){
        return (i-1)/d;

    }
    //return kth child
    private int kthChild(int i, int k){
        return d*i +k;

    }
    //insert new element into the heap
    public void insert(int x){
        if(isFull())
            throw new NoSuchElementException("Heap is full, No space to insert ");
            heap[heapSize++]=x;
            heapifyUp(heapSize-1);

    }
 
    public int delete(int x){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty, no element to delete");
        int key = heap[x];
        heap[x]=heap[heapSize-1];
        heapSize--;
        heapifyDown(x);
        return key;
    }

    private void heapifyUp(int i){
        int child;
        int temp = heap[i];
        while(i>0 && temp >heap[parent(i)]){
                heap[i]=heap[parent(i)];
                i=parent(i);

        }
        heap[i]= temp;

    }
    private void heapifyDown(int i){
        int child;
        int temp = heap[i];
        while (kthChild(i,1)<heapSize){
            child = maxChild(i);
            if(temp<heap[child]){
                heap[i]=heap[child];

            }else break;
            i=child;

        }
        heap[i] = temp; } private int maxChild(int i) { int leftChild = kthChild(i, 1); int rightChild = kthChild(i, 2); return heap[leftChild]>heap[rightChild]?leftChild:rightChild;
    }
    //print the heap
    public void printHeap()
    {
        System.out.print("nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }

    //return max from the heap
    public int findMax(){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty.");
        return heap[0];
    }
}
//class Main{
//    public static void main(String[] args){
//        binary_heap maxHeap = new binary_heap(10);
//
//        maxHeap.insert(1);
//        maxHeap.insert(2);
//        maxHeap.insert(3);
//        maxHeap.insert(4);
//        maxHeap.insert(5);
//        maxHeap.insert(6);
//        maxHeap.insert(7);
//        maxHeap.printHeap();
//        //maxHeap.delete(5);
//        //maxHeap.printHeap();
//
//    }
//}



