package com.yash;

public class Patterns {
    public static void main(String[] args) {
        pattern31(4);

    }
    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for (int row = 0; row<= n; row++){
            for (int col = 0; col<=n; col++){
                int atEveryTndex = originalN - Math.min(Math.min(row, col), Math.min(n - row,n - col));
                System.out.print(atEveryTndex + " ");

            }
            System.out.println();

        }
    }

}
