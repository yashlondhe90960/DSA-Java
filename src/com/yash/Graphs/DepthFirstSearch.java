package com.yash.Graphs;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

class GraphDFS{
private int Vertices;
private LinkedList<Integer> adjlist[];

GraphDFS(int count_v){
    Vertices = count_v;
    adjlist=new LinkedList[count_v];
    //to create adjacency list
    for(int i=0;i<count_v;++i)
        adjlist[i]=new LinkedList();
}
void addnewEdge(int v,int w){
    adjlist[v].add(w);

}

void traversalDFS(int v,boolean vnodelist[]){
    vnodelist[v]=true;
    System.out.print(v + " ");

    //iterate over list
    Iterator<Integer> i=adjlist[v].listIterator();
    while(i.hasNext()){
        int n=i.next();
        if(!vnodelist[n])

            traversalDFS(n,vnodelist);

    }

}
void DFS(int v){
    boolean visited[]= new boolean[Vertices];

    traversalDFS(v,visited);
}
}
public class DepthFirstSearch {
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(10);

        g.addnewEdge(1,2);
        g.addnewEdge(2,3);
        g.addnewEdge(3,4);
        g.addnewEdge(4,5);
        g.addnewEdge(5,7);
        g.addnewEdge(1,3);
        g.addnewEdge(1,5);
        g.addnewEdge(5,5);
        g.addnewEdge(2,6);
        g.addnewEdge(3,7);

        System.out.println("depth first traversal  of graph is:");

        g.DFS(1);
    }

}
