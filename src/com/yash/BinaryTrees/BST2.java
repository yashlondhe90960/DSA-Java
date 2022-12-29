package com.yash.BinaryTrees;

public class BST2 {
    public static void main(String[] args) {
        AVL_trees tree = new AVL_trees();
        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(27);
        tree.insert(19);
        tree.insert(16);
        tree.display();
    }
}