package com.yash.Hashing;

import java.util.Hashtable;

public class HashTable2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Yash");
        map.put(102,"Sakshi");
        map.put(103,"Prince");
        map.put(105,"Ojal");
        System.out.println("Before Remove:"+ map);
        //Remove value for key 102
        map.remove(102);
        System.out.println("After remove:"+map);
    }
}
