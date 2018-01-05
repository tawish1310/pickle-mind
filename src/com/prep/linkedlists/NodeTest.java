package com.prep.linkedlists;

public class NodeTest {

    int data;
    //this might not be necessary
    //NodeTest head;
    NodeTest next;
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
       public NodeTest getNext() {
        return next;
    }
    public void setNext(NodeTest next) {
        this.next = next;
    }
    public NodeTest(int data, NodeTest next) {
        super();
        this.data = data;
        this.next = next;
    }
    
    public NodeTest(int data){
        this.data = data;
    }
    
    public NodeTest(){
        
    }
}
