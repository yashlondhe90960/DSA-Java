package com.yash;

public class Huffman_Node {
    Character charac;
    Integer frequency;
    Huffman_Node left = null,right=null;

    Huffman_Node(Character charac,Integer frequency){
        this.charac=charac;
        this.frequency=frequency;
    }
    public Huffman_Node(Character charc ,Integer frequency, Huffman_Node left,Huffman_Node right){
        this.charac = charc;
        this.frequency=frequency;
        this.left=left;
        this.right=right;

    }


}
