package com.yash.BinaryTrees;

public class AVL_trees {
    public static void main(String[] args) {

    }

    public void display() {
    }

    private class Node {
        int data;
        Node right;
        Node left;
        int height;

        Node(int data) {
            this.data = data;

        }

    }

    private Node root;

    public void insert(int item) {
        this.root = insert(this.root, item);
    }

    private Node insert(Node node, int item) {

        if (node == null) {
            Node nn = new Node(item);
            return nn;

        }
        if (item > node.data) {
            node.right = insert(node.right, item);
        } else if (item < node.data) {
            node.left = insert(node.left, item);

        }
        return node;

    }



    private void display(Node node) {
        if(node==null){
            return;
        }

        //self work
        String str = " ";
        if (node.left == null) {
            str += " . ";
        } else {
            str += node.left.data;

        }
        str += "=>" + node.data + "<=";
        if (node.right == null) {
            str += " . ";
        } else {
            str += node.right.data;
        }
        System.out.println(str);

       display(node.left);
       display(node.right);
    }
}