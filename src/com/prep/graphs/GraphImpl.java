package com.prep.graphs;

import java.util.LinkedList;


/**
 * A graph consists of Vertices and Edges
 * O(V+E) for Adjacency Lists Implementation
 * For adjacency Matrix the O(V^2)
 * Inputs to Graph Searches will be the Starting point and The Graph
 * DIrected Graphs: Number of edges
 * Undirected Graphs: number of Vertices
 *Adjacency list =List<lists>
 * @author tnaqvi
 *
 */
public class GraphImpl {
    
    public int vertex;
    public int edge;
    public LinkedList adjacencyList[]; //an array of Adjacency List
    
    /**
     * Constructor to assign all vertices to the LinkedList adjanceny list
     */
    public GraphImpl(int V){
        this.vertex=V;
        adjacencyList= new LinkedList[V];
        for(int i=0;i<adjacencyList.length;i++){
            adjacencyList[i]=new LinkedList<>();
        }
    }
    
    /**
     * Add edge to the List
     */
    public void addEdge(int v,int E){
        adjacencyList[v].add(E);
    }

}
