package com.yash.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;

        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);

                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);

                }
                if(currNode.right !=null){
                    q.add(currNode.right);

                }

            }
        }
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int hieght(Node root){
        if(root==null){
            return 0;
        }

        int LeftHieght = hieght(root.left);
        int rightHieght = hieght(root.right);

        int MyHieght = Math.max(LeftHieght,rightHieght)+1;

        return MyHieght;

    }

    //diameter of tree
    //approach 1 O(N^2)
    public static int diameter(Node root ){
        if(root==null){
            return 0;

        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = hieght(root.left) + hieght(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));

    }
    //approach2 O(N)

    static class TreeInfo{
       int ht;
       int diam;

       TreeInfo(int ht,int diam){
           this.ht=ht;
           this.diam=diam;
       }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            new TreeInfo(0,0);
            return new TreeInfo(0,0);
        }


        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int MyHeight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = left.diam;
        int diam3 = left.ht+ right.ht+ 1;

        int myDiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(MyHeight,myDiam);
        return myInfo;




    }


    public static void main(String[] args) {
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree = new BinaryTree();
      Node root = tree.buildTree(nodes);

        System.out.println(diameter2(root).diam);
      }
    }






//System.out.println(root.data);
////        preorder(root);
//        inorder(root);
//        postorder(root);
//        levelOrder(root);