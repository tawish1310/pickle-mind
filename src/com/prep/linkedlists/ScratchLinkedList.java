package com.prep.linkedlists;
public class ScratchLinkedList {
    
    public NodeTest head;
    public NodeTest tail;
    int size;
    
    
    /**
     * For inserting at start we just need the data 
     * @param newStartNode
     */
    public void insertAtStart(int newStartNodeData){
        NodeTest newNode= new NodeTest();
        newNode.setData(newStartNodeData);
        NodeTest tempNode= new NodeTest();
        if(head!=null){
            //System.out.println(head.data);
            tempNode=head;//5--head
           // System.out.println(tempNode.data);
            head=newNode;
           // System.out.println(head.data);
            newNode.setNext(tempNode);
            //System.out.println(newNode.next.data);
           //System.out.println("head of the list is now"+head.getData()+"next element is "+head.next.data);
                   }  
        else{
            
            head=newNode;
            System.out.println("Head of the list is "+head.data);
        }
        size++;
        
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }
    
 
    

}
