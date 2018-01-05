package com.prep.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * BFS uses Queue(FIFO)
 * List<Vertex>
 * Returns the path with the shortest number of nodes
 * O(V+E) 
 * @author tnaqvi
 *
 */
public class BFSImpl {

    List<Vertex> listOfNeighbourEdges;
    
    Queue<Vertex> queue= new LinkedList<Vertex>();
    
    /**
     * This will add the vertex to the queue
     * @param vertex
     */
    
    public void bfs(Vertex vertex){
        queue.add(vertex);
        vertex.visited=true;
        while(!queue.isEmpty()){
            Vertex v =queue.remove(); //Throws an exception if Q empty else acts like poll
            
            System.out.print(v.label + "\t");
            for(Vertex currentVertex :v.getAdjacentEdges()){
                if(currentVertex.visited==false && currentVertex!=null){
                    queue.add(currentVertex);
                    currentVertex.visited=true;
                }
            }
        }
        
    }
    
    public static void main(String arg[])
    {
 
        Vertex node40 =new Vertex(40);
        Vertex node10 =new Vertex(10);
        Vertex node20 =new Vertex(20);
        Vertex node30 =new Vertex(30);
        Vertex node60 =new Vertex(60);
        Vertex node50 =new Vertex(50);
        Vertex node70 =new Vertex(70);
 
        node40.addEdges(node10);
        node40.addEdges(node20);
        node10.addEdges(node30);
        node20.addEdges(node10);
        node20.addEdges(node30);
        node20.addEdges(node60);
        node20.addEdges(node50);
        node30.addEdges(node60);
        node60.addEdges(node70);
        node50.addEdges(node70);
        System.out.println("The BFS traversal of the graph is ");
        BFSImpl bfsExample = new BFSImpl();
        bfsExample.bfs(node40);
 
    }
}
