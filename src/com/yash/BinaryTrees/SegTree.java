package com.yash.BinaryTrees;


//update
public class SegTree {
    int stArr[];
    SegTree(int a[],int s)
    {
        int h=(int)(Math.ceil(Math.log(s)/Math.log(2)));
        //max size
        int maxSize = 2*(int)Math.pow(2,h)-1;
        //allocating memory for arr
        stArr = new int[maxSize]; constructST(a, 0, s - 1, 0);

    }
    int getMidIndex(int f,int l) {
        return f + (l - f) / 2;
    }
    int getSumUtil(int x,int y,int i, int j, int si) {
        if (i <= x && j >= y) {
            return stArr[si];

        }
        //if the segment of node is outside of the given range
        if (y < i || x > j) {
            return 0;
        }

        int midVal = getMidIndex(x, y);
        return getSumUtil(x, midVal, i, j, 2 * si + 1) + getSumUtil(midVal + 1, y, i, j, 2 * si + 2);
    }

    void updateValUtil(int x,int j,int y, int val,int si){
        if(j<x || j>y){
            return;
        }
        stArr[si]=stArr[si]+val;
        if(y!=x){
            int midVal = getMidIndex(x,y);
            updateValUtil(x,midVal,j,val,2*si+2);
            updateValUtil(midVal+1,y,j,val,2*si+2);
        }
    }

    void updateVal(int a[],int s,int j,int newVal){
        if (j < 0 || j > s - 1) {
            System.out.println("Input is invalid!!");
            return;
        }
        int diffVal = newVal-a[j];

        stArr[j]=newVal;
        updateValUtil(0,s-1,j,diffVal,0);

    }

    int getSum(int s,int x,int y){
        if(x<0 || x>s-1 || x>y){
            System.out.println("The input is invalid");
            return -1;
        }
        return getSumUtil(0,s-1,x,y,0);
    }

    int constructST(int a[], int x, int y, int si) {
        if (x == y) {
            stArr[si] = a[x];
            return a[x];
        }

        int mid = getMidIndex(x, y);
        stArr[si] = constructST(a, x, mid, si * 2 + 1) + constructST(a, mid + 1, y, si * 2 + 2);
        return stArr[si];
    }
    //Main method
    public static void main(String[] args) {
        int a[] = {2, 4, 7, 10, 12, 13};
        int size = a.length;

        SegTree tree = new SegTree(a, size);
        System.out.println("Sum of values in the given range 1 to 4 =" + tree.getSum(size, 1, 4));
        // Update: setting arr[3] = 11 and updating the corresponding segment of tree nodes

        tree.updateVal(a, size, 3, 11);

        System.out.println("Updated sum of values in the given range" + tree.getSum(size, 1, 4));

    }

    }

