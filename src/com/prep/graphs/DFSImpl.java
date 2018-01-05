package com.prep.graphs;

import java.util.List;
import java.util.Stack;

/**There will be 2 implementations of the dfs
 * 1) dfsSearch
 * 2) Using the below set of questions
 * How to keep track of the NEXT node or Search NEXT? :Use Stack for Non-recursive Solution ELSE use Recursive Strategy
 * How to keep track of node visited? :HashSet
 * How to keep track of the path from start to goal ?: use HashMap
 * O(V+E) )
 * 
 * @author tnaqvi
 *
 */
public class DFSImpl {

    public GraphImplAdjMatrix graph= new GraphImplAdjMatrix();
   
    
    public static void main(String[] args){
        DFSImpl dfs= new DFSImpl();
        dfs.graph.addVertex(1);
        dfs.graph.addVertex(5);
        dfs.graph.addVertex(6);
        dfs.graph.addVertex(3);
        dfs.graph.addVertex(9);
        dfs.graph.addEdge(1, 5);
        dfs.graph.addEdge(1, 9);
        //dfs.graph.dfsSearch();
        //////////////////////////////////////////
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
        
        System.out.println("The DFS traversal of the graph is ");
        DFSImpl dfsExample = new DFSImpl();
      // dfsExample.dfsSearchUsingAdjLists(node10);
       dfsExample.dfs(node40);
    }
    
    /**
     * using stack NOT Working!
     * @param v
     */
    public void dfsSearchUsingAdjLists(Vertex v){
        Stack<Vertex> stacks= new Stack<Vertex>();
        stacks.push(v);
        v.visited=true;
      
      
        while(!stacks.isEmpty()){
            Vertex currentVertex= stacks.pop();
            System.out.println(v.label+"\t");
            for (Vertex v1:currentVertex.getAdjacentEdges()){
                if(v1.visited==false && v1!=null){
                    stacks.push(v1);
                    v1.visited=true;
                }
               
            }
        }
        
    }
    /** using recusrions works!
     * This is where backtracking also comes into play
     * @param node
     */
    
    public  void dfs(Vertex node)
    {
        System.out.print(node.label + " ");
        List<Vertex> neighbours=node.getAdjacentEdges();
        for (Vertex n: neighbours) {
           if(n!=null && !n.visited)
            {
               
                dfs(n);
                n.visited=true;
 
            }
        }
    }
}
