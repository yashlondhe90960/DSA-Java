package com.yash.Hashing;

import java.util.HashMap;
import java.util.Map;
//replacing elements
public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(100,"Vijay");
        hm.put(100,"Rahul");
        System.out.println("Initial list of elements:");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated List of elements :");
        hm.replace(102,"Gaurav");
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements");
        hm.replace(101,"Vijay","Ravi");
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k,v)->"Ajay");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
