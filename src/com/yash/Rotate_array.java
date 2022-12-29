//package com.yash;
//import org.apache.commons.lang3.ArrayUtils;
//public class Rotate_array {
//    class Solution {
//        public void rotate(int[] nums, int k) {
//            if(nums.length==0 || (k %=nums.length)==0){
//                return ;
//
//            }
//            int n = nums.length;
//            ArrayUtils.reverse(nums,0,n-k);
//
//
//            ArrayUtils.reverse(nums,n-k,nums.length);
//
//            ArrayUtils.reverse(nums,0,nums.length);
//
//
//        }
//    }
//
//    class Soluton_kTimesAllItemsMoving{
//        public void rotate(int[] nums,int k){
//            while(k>0){
//                k--;
//
//                int temp=nums[nums.length-1];
//                for(int i=nums.length-1;i>=1;i--){
//                    nums[i]=nums[i-1];
//                }
//                nums[0]=temp;
//
//            }
//        }
//    }
//}
