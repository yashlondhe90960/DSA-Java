package com.yash;

public class Prime {
//    public static void main(String[] args) {
//        int n = 40;
//        for (int i = 2; i <= 40; i++) {
//            System.out.println(i + " " + isPrime(i));
//        }
//    }
//
//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        int c = 2;
//        while (c * c <= n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        int n = 3;
        m = n / 2;
        if (n == 0 || n == 10) {

            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not prime number");
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }}