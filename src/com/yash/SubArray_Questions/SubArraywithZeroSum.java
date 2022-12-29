package com.yash.SubArray_Questions;

import java.util.HashSet;
import java.util.Set;

public class SubArraywithZeroSum {
    public static void main(String[] args) {
        int[] a ={2,1,3,-4,-2};
        int k=6;
        boolean found=false;

//        for(int i=0;i<a.length;i++){
//            int sum=0;
//            for(int j=i;j<a.length;j++){
//                sum += a[j];
//                if(sum==0){
//                    found = true;
//                    break;
//
//                }
//            }
//            if(found) break;
//
//        }

        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int element :a){
            set.add(sum);
            sum += element;

            if(set.contains(sum)){
                found=true;
                break;

            }

        }
        System.out.println("Found "+ found);

    }
}
