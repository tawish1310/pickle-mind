package com.prep.trees;

import java.util.LinkedList;
import java.util.Queue;

import com.prep.graphs.GraphImpl;
import com.prep.graphs.Vertex;

/**
 * ctCi Tree 4.1
 * @author tnaqvi
 * @date Nov 30, 2017
 * Given a directed graph ,design an algorithm to find whether there is a route between 2 nodes
 */
public class RouteBetweenNodes {

    /**
     * Need to do Graph Traversal: BFS
     * @param v1
     * @param v2
     * @return
     */
    public boolean isPathExists(GraphImpl graph){
       //do a bfs : use Q
        Queue queue= new LinkedList();
        boolean visited[]= new boolean[2];
        queue.add(graph.vertex);
        visited[graph.vertex]=true;
        
        while(!queue.isEmpty()){
        
    }
        return true;
}
    }
