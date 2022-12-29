package com.yash.Hashing;

import java.util.HashMap;

class ValueEntry {
    String key;
    int value;

    ValueEntry(String key, int value) {
        this.key = key;
        this.value = value;
    }

}
//class 2
class HashTable{
    private int HASH_TABLE_SIZE;
    private int size;
    private ValueEntry[] table;
    private int totalprimeSize;

    public HashTable(int ts){
        size=0;
        HASH_TABLE_SIZE=ts;
        table=new ValueEntry[HASH_TABLE_SIZE];

        for(int i=0;i<HASH_TABLE_SIZE;i++)
            table[i]=null;
        totalprimeSize=getPrime();
    }
    //check whether prime
    public int getPrime(){
        for(int i=HASH_TABLE_SIZE-1;i>=1;i--){

            int cnt=0;

            for(int j=2;j*j<=i;j++)
                if(i%j==0)
                    cnt++;
            if(cnt==0)
                return i;
        }
        return 3;

    }

    //get no. of key value pairs
    public int getSize(){return size;
    }public boolean isEmpty(){return size==0;
    }

public void makeEmpty() {
    size = 0;
    for (int i = 0; i < HASH_TABLE_SIZE; i++)
        table[i] = null;
}
//method 3
    public int getkey(String key){
        int hash1=myhash1(key);
        int hash2=myhash2(key);

        while(table[hash1]!=null && !table[hash1].key.equals(key)){
            hash1 +=hash2;
            hash1 %=HASH_TABLE_SIZE;

        }
        return table[hash1].value;

    }

    //method 4
    public void insert(String key, int value)
    {
        // checking the size of table and
        //  comparing it with users input value
        if (size == HASH_TABLE_SIZE) {

            // Display message
            System.out.println("Table is full");
            return;
        }

        int hashing1 = myhash1(key);
        int hashing2 = myhash2(key);
        while (table[hashing1] != null) {
            hashing1 += hashing2;
            hashing1 %= HASH_TABLE_SIZE;
        }

        table[hashing1] = new ValueEntry(key, value);
        size++;
    }

    //remove key
    public void remove(String key){
        int hash1=myhash1(key);
        int hash2=myhash2(key);
        while(table[hash1]!=null && !table[hash1].key.equals(key)){
            hash1 += hash2;
            hash1 &= HASH_TABLE_SIZE;

        }
        table[hash1]=null;
        size--;


    }
    private int myhash1(String y) {
        int myhashVal1 = y.hashCode();
        myhashVal1 %= HASH_TABLE_SIZE;
        if (myhashVal1 < 0)
            myhashVal1 += HASH_TABLE_SIZE;
        return myhashVal1;
    }

    private int myhash2(String y) {
        int myhashVal2 = y.hashCode();
        myhashVal2 %= HASH_TABLE_SIZE;
        if (myhashVal2 < 0)
            myhashVal2 += HASH_TABLE_SIZE;
        return totalprimeSize - myhashVal2 % totalprimeSize;
    }

    public void printHashTable() {
        System.out.println("\nHash Table");
        for (int i = 0; i < HASH_TABLE_SIZE; i++)
            if (table[i] != null)
                System.out.println(table[i].key + " " + table[i].value);
            }
    }


public class DoubleHashingExample {
    public static void main(String[] args) {
        System.out.println("Hash Table testing:");

        HashTable ht= new HashTable(100);
        ht.insert("prime",97);
        ht.insert("even",96);
        ht.insert("odd",95);


        ht.printHashTable();

    }

    }

