//package com.yash.Graphs;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Edge
//{
//    int s, d, w;
//    Edge(int src, int dest, int weight)
//    {
//        this.s = src;
//        this.d = dest;
//        this.w = weight;
//    }
//}
//class Node
//{
//    int value, weight;
//    Node(int value, int weight)
//    {
//        this.value = value;
//        this.weight = weight;
//    }
//    @Override
//    public String toString()
//    {
//        return this.value + " (" + this.weight + ")";
//    }
//}
//class GraphIMP
//{
//    List<List<Node>> adjlist = new ArrayList<>();
//    public GraphIMP(List<Edge> edges)
//    {
//        int n = 0;
//     for (Edge e: edges)
//        {
//            n = Integer.max(n, Integer.max(e.s, e.d));
//        }
//        for (int i = 0; i <= n; i++)
//        {
//            adjlist.add(i, new ArrayList<>());
//        }
//        for (Edge e: edges)
//        {
//            adjlist.get(e.s).add(new Node(e.d, e.w));
//        }
//    }
//    public static void printGraph(Graph graph)
//    {
//        int src = 0;
//        int n = graph.adjlist.size();
//        System.out.printf("Adjacency List for the Graph is: ");
//        while (src < n)
//        {
//            for (Node edge: graph.adjlist.get(src))
//            {
//                System.out.printf("%d -- > %s\t", src, edge);
//            }
//            System.out.println();
//            src++;
//        }
//    }
//}
//public class Weighted_graph
//{
//    public static void main (String args[])
//    {
//        List<Edge> edges = Arrays.asList(new Edge(1, 4, 3), new Edge(4, 2, 5), new Edge(2, 5, 10), new Edge(5, 1, 6), new Edge(3, 2, 9), new Edge(1, 5, 1), new Edge(3, 5, 2));
//        Graph graph = new Graph(edges);
//        Graph.printGraph(graph);
//    }
//}
//
//
//
