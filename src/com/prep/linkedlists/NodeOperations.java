package com.prep.linkedlists;

public class NodeOperations {

    public static void main(String[] args) {
        
        ScratchLinkedList st= new ScratchLinkedList();
        st.insertAtStart(4);
        st.insertAtStart(5);
        st.insertAtStart(9);
        st.insertAtStart(10);
        System.out.println(st.getSize());
       for(int i=0;i<st.getSize();i++){
           System.out.println();
       }
    }
    
}
