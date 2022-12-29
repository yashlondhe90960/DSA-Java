package com.yash.Graphs;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

class GraphTOPO{
    private int V;
    private ArrayList<ArrayList<Integer>>adj;
    GraphTOPO(int v){
        V=v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;++i)
            adj.add(new ArrayList<Integer>());

    }

    void addEdge(int v, int w){

        adj.get(v).add(w);

    }

    void toplogicalSortUtil(int v, boolean visited[], Stack<Integer> stack)
    {
        visited[v]=true;
        Integer i;

        Iterator<Integer> it = adj.get(v).iterator();
        while(it.hasNext()){
            i=it.next();
            if(!visited[i])
                toplogicalSortUtil(i,visited,stack);

        }

        stack.push(new Integer(v));

    }

    void topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();

        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++)
            visited[i] = false;


        for(int i=0;i<V;i++)
            if(visited[i]==false)
                toplogicalSortUtil(i,visited,stack);

        while(stack.empty()==false)
            System.out.print(stack.pop()+" ");

    }

    public static void main(String[] args) {
        GraphTOPO g= new GraphTOPO(26);
        Scanner scan = new Scanner(System.in);
        char ch;

        do{
            System.out.println("Please choose one of the operations:");
            System.out.println("1. To create a Directed Acyclic graph (DAG) for topological sort");
            System.out.println("2. To print the result of the topological sort.");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    g.addEdge(25,10);
                    g.addEdge(25,0);
                    g.addEdge(20,0);
                    g.addEdge(20,5);
                    g.addEdge(10,15);
                    g.addEdge(15,5);
                    break;
                case 2:
                    System.out.println("The result after topological sort of DAG is:");
                    g.topologicalSort();
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("\nDo you want to continue(Type y or n)\n");
            ch= scan.next().charAt(0);
        }
        while(ch=='Y'|| ch =='y');

    }
}








public class TopologicalSort {

}














