package com.yash.Hashing;

public class QuadraticProbing {


    static void printArray(int arr[])
    {


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void hashing(int table[], int tsize,
                        int arr[], int N)
    {


        for (int i = 0; i < N; i++) {


            int hv = arr[i] % tsize;


            if (table[hv] == -1)
                table[hv] = arr[i];
            else {


                for (int j = 0; j < tsize; j++) {


                    int t = (hv + j * j) % tsize;
                    if (table[t] == -1) {


                        table[t] = arr[i];
                        break;
                    }
                }
            }
        }

        printArray(table);
    }

    public static void main(String args[])
    {
        int arr[] = { 50, 700, 76, 85,
                92, 73, 101 };
        int N = 7;


        int L = 7;
        int hash_table[] = new int[L];


        for (int i = 0; i < L; i++) {
            hash_table[i] = -1;
        }


        hashing(hash_table, L, arr, N);
    }
}