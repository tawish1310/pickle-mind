package com.prep.graphs;

import java.util.GregorianCalendar;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
/**
 * Graph Class
 * @author tnaqvi
 *
 */
public class GraphImplAdjMatrix {

    public Vertex vertexList[]; //use a List array ??
    public int adjMatrix[][]; //used to store edges where everyEdge is represented as a 1/0 if its connected/Not COnnected
    public int vertexCount;
    final int verticesCount=20; //default
    public Stack stack; //DFS uses Stack 
    
    public GraphImplAdjMatrix(){
       
        vertexList=new Vertex[verticesCount];
        System.out.println(vertexList);
        stack= new Stack();
        vertexCount=0;
        adjMatrix= new int[verticesCount][verticesCount];
        for(int i=0;i<verticesCount;i++){
            for(int j=0;j<verticesCount;j++){
            adjMatrix[i][j]=0;
        }
    }
}
    /**
     * Add Vertex to the list Array
     * @param v
     */
    public void addVertex(int v){
        System.out.println(vertexCount);
        vertexList[++vertexCount]= new Vertex(v);
    }
    
    /**
     * Add edge
     * Its an undirected graph so edge gets added at both the vertices(to,from)
     */
    public void addEdge(int from,int to){
        adjMatrix[from][to]=1; 
        adjMatrix[to][from]=1;
    }
    
    public void dfsSearch(){
       vertexList[0].visited=true; //start of the search the first node;
        //push it on to the stack 
       stack.push(12);
        while(!stack.isEmpty()){
            //check if a vertex is visited or not using stack peek since we will pnly pop the element if its not visite
            for(int i=0;i<vertexCount;i++){
                int currentVertex=(int) stack.peek();
                System.out.println(currentVertex);
               if( vertexList[i].visited==false){
                   //set the vertex to visited 
                   System.out.println("::::"+vertexList[currentVertex]);
                   vertexList[currentVertex].visited=true;
                   stack.push(currentVertex);
                   System.out.println(stack.size());
               }
               else{
                   stack.pop();
                   System.out.println("popped"+stack.size());
               }
            }
        }
        
    }
}
