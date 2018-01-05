package com.prep.heap;
/**
 * Heap is a DS which is a complete binary tree
 * The diff between its parent and child nodes is 1(height=1)
 * To find the parent node ((i-1)/2)
 * Left child : (2i+1) Right child(2i+2)
 * Min Heap (Root/parent node is < Child Nodes)
 * Max heap(Root/Parent node is > Child Nodes)
 * Heap is a DS used for finding Min/max 
 * At all times the Heap should maintain its sanctity of being a min/max heap so we Heap-ify by adjusting
 * the values of all the nodes : either percolate down or percolate up
 * Percolate up:
 * Percolate down:
 *
 * @author tnaqvi
 *
 */
public class Heap {

    public int[] heap;
    public int capacity; //size of the heap  also needs to be a default value
    public int num; //num of elements in heap 
    
    public Heap(int capacity){
        heap= new int[capacity];
    }
    /**
     * increase the size of the heap when adding the new element
     * When we increase the size of array we need to DOuble it and copy the 
     * old array to a new increased size array
     */
    public void Resize(){
        int[] temp;
        /**int newArray[]=new int[capacity*2];
        System.arraycopy(heap, 0, newArray, newArray.length-1, newArray.length);--->this will copy all the heap elements into newArray
        but we need to resize the heap[] : since we know arrays cannot be resized use swap and hold the data in a 
       temp var and then re-init the heap[] with new capacity  **/
        temp=new int[this.capacity];
        System.arraycopy(heap, 0, temp, temp.length-1, temp.length);
        this.heap=new int[capacity*2];
        for(int i=0;i<capacity;i++){ // copy old elements into increased Cap array
            heap[i]=temp[i];
        }
        //for GC :
        temp= null;
            
    }
    /**
     * Get above node
     * @param i
     * @return
     */
    public int getParent(int i){
        if(i<=0 || i >=this.num) return -1;
        return i-1/2;
    }
    /**
     * 
     * @param i
     * @return
     */
    
    public int getLeftChild(int i){
        int left=2*i+1/2;
        if(left>=this.capacity) return -1;
        else return left;
    }
    
    /**
     * 
     * @param i
     * @return
     */
    public int getRightChild(int i){
        int right=2*i+2;
        if(right>=this.capacity) return -1;
        return right ;
    }
    
    /** Remove an element use the percolateDown
     * Heapifying using percolate down: In this we remove the root node for maxHeap
     * and assign the last node to the root node
     * now recursively check for left and right 
     */
    
    public void percolateDown(int j){
        int temp,max;
        int left=getLeftChild(j);
        int right= getRightChild(j);
        if(left!=-1 && heap[left]>heap[j]) max=left; //comapre left heap node to current node
        else max=j;
        
       if(right!=-1 && heap[right]>heap[j]) max=right;
       else max=j;
       
       if(max!=j){
           temp=heap[j];
           heap[j]=heap[max];
           heap[max]=temp;
       }
       percolateDown(max);
    
    }
    
    /**
     * Use percolate up for inserting the element
     */
    
    public void percolateUp(int up){
        int temp;
        int parent= getParent(up);
        if(parent<up){
            temp=heap[parent];
            heap[parent]=heap[up];
            heap[up]=temp;
        }
    }
}
