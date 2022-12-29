package com.yash;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 32;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);


    }
}
