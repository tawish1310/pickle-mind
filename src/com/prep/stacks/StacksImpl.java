package com.prep.stacks;
/**
 * Stacks are implemented using arrays
 * @author tnaqvi
 *
 */
public class StacksImpl {
    
    static int minCapacity=10;
    int[] stack;
    int top=-1;// initialize the index =-1
    
    public StacksImpl(){
        stack= new int[minCapacity];
        
    }
   
    public boolean isStackEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
   /**
    * Add data into the stack
    * @param data
 * @throws Exception 
    */
    public void push(int data) throws Exception{
        if(stack.length==size()) throw new Exception("Stack Overflow");
        stack[++top]=data;
    }
    
    /**
     * pop or remove the top element
     * @throws StackImplException 
     */
    public int pop() throws StackImplException{
        int popedData;
        if(isStackEmpty()) throw new StackImplException("Stack is empty");
         popedData=stack[top];
            stack[top--]=Integer.MIN_VALUE;//dereferencing for GC ..hmmm think anout it
            return popedData;
        
    }
    
    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
          */
    
    public int peek(){
        return stack[top];
    }
}
