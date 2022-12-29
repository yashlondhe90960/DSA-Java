package com.yash.Hashing;

import java.util.Hashtable;
import java.util.Map;

class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name,String author, String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
}
public class HashTableExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book> map = new Hashtable<Integer,Book>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications ","Forouzan","Mc Graw hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for(Map.Entry<Integer,Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b = entry.getValue();
            System.out.println(key +"Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}
