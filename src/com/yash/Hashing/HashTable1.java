package com.yash.Hashing;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<Integer, String>();


        hm.put(100,"Amit");
        hm.put(102,"Yash");
        hm.put(101,"Prince");
        hm.put(103,"Amit");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());

        }

    }
}
