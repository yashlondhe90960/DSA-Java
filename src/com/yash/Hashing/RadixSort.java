package com.yash.Hashing;

public class RadixSort {

    int getMax(int a[],int n){
        int max = a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max)
                max=a[i];

        }
        return max;  //max element of arr
    }
    void countingSort(int a[],int n,int place){
        int[] output = new int[n+1];
        int[] count = new int[10];

        //count of elements
        for(int i=0;i<n;i++)
            count[(a[i]/place)%10]++;

        //cumulative frequency
        for(int i=1;i<10;i++)
            count[i] += count[i-1];

        //sorting
        for(int i=n-1;i>=0;i--){
            output[count[(a[i] / place) % 10] - 1] = a[i];
            count[(a[i] / place) % 10]--;

        }
        for (int i=0;i<n;i++)
            a[i] = output[i];
    }

    //implementing radix sort
    void radixSort(int a[], int n){

        int max=getMax(a,n);


        for(int place = 1;max/place>0;place*=10)
            countingSort(a,n,place);
    }
    //print arr elements

    void printArray(int a[],int n){
        for(int i=0;i<n;++i)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        int a[]={151,259,360,91,115,706,34,858,2};
        int n=a.length;
        RadixSort r1=new RadixSort();
        System.out.println("Before sorting elements are:\n");
        r1.printArray(a,n);
        r1.radixSort(a,n);
        System.out.println("\n\nAfter applying Radix sort, the array is:\n");
    r1.printArray(a,n);


    }
}
