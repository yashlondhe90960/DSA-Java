package com.yash.Hashing;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        map.put(104,"Gaurav");
        System.out.println("Initial list of elements:"+map);

        map.remove(100);
        System.out.println("Updated list of elements"+map);

        map.remove(101);
        System.out.println("Updated list of elements:"+map);

        map.remove(102,"Rahul");
        System.out.println("Updated list of elements:"+map);


    }
}
