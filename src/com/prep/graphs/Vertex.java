package com.prep.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for the Vertices properties for a Graph
 * A VErtex consists of data(int/char),visited(boolean)
 * @author tnaqvi
 *
 */
public class Vertex {

    public int  label;
    public boolean visited;
    //List of edges for BFS
    public List<Vertex> adjacentEdges= new ArrayList<Vertex>();
    public Vertex(){
        
    }
    
    /** 
     *Contructor
     * @param ch
     */
    public Vertex(int ch){
        label=ch;
        visited=false;
    }

    public List<Vertex> getAdjacentEdges() {
        return adjacentEdges;
    }

    public void setAdjacentEdges(List< Vertex> adjacentEdges) {
        
        this.adjacentEdges = adjacentEdges;
       
    }
    
    public void addEdges(Vertex v){
        this.getAdjacentEdges().add(v);
    }
    
    
}
