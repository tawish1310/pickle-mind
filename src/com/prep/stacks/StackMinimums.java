package com.prep.stacks;
/**
 * 
 * @author tnaqvi
 * @date Nov 14, 2017
 */
public class StackMinimums {
    
    StacksImpl dataStack= new StacksImpl();
    StacksImpl minStack= new StacksImpl();
    int minimum;
    /**
     * 
     * @throws Exception 
     */
    public  int getMinimumElementInStack() throws Exception{
        
        if(dataStack.isStackEmpty()) return -1;
        else if(minStack.isStackEmpty()|| dataStack.peek()<minStack.peek()){
           
            minStack.push(minimum);
            System.out.println("Min is "+minimum);
            getMinimumElementInStack();
        }
       
       
        return minimum;
    }
    /**
     * Sorting the stack with 2 stacks is a good way to find minimum
     * 
     * @param args
     * @throws Exception
     */
    
    public void sortStackAndReturnMinimum() throws Exception{
        while(dataStack.isStackEmpty()){
            int minimum=dataStack.pop();
            while(!minStack.isStackEmpty() && minStack.peek()>minimum){
                dataStack.push(minStack.pop());
            }
            minStack.push(minimum);
        }
        while(minStack.isStackEmpty()) dataStack.push(minStack.pop());
    }
    
    
    
    public static void main(String[] args) throws Exception{
       StackMinimums stackMin= new StackMinimums();
       stackMin.dataStack.push(1);//if the element is at the last (bottom of stack ) works !
       stackMin.dataStack.push(3);
       stackMin.dataStack.push(9);
       stackMin.dataStack.push(2);
       stackMin.dataStack.push(1); //if the min element is in the middle the method returns a false result;
       stackMin.dataStack.push(7);
       stackMin.dataStack.push(8);
       
      int getMin=stackMin.getMinimumElementInStack();
       System.out.println(getMin);
    }
    

}
