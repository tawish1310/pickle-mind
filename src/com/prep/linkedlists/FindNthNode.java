package com.prep.linkedlists;

import com.prep.linkedlists.MergeTwoLinkedLists.ListNode;

/**
 * Program to find nth node in a Linked list
 * @author tnaqvi
 * @date Jan 3, 2018
 */
public class FindNthNode {

    /**
     * what is the size of the linked List
     * @param n
     */
    public ListNode findNthNodeFromEnd(int k,ListNode n){
        // make pointers p1 and p2 point to the start of the list.
        ListNode headptr=n;
        ListNode referenceptr=n;
        // The key to this algorithm is to set p1 and p2 apart by n-1 nodes initially
        // so we want p2 to point to the (n-1)th node from the start of the list
        // then we move p2 till it reaches the last node of the list. 
        // Once p2 reaches end of the list p1 will be pointing to the nth node 
        // from the end of the list.

        // loop to move refereneceptr
        for(int i=0;i<k-1;i++){
            referenceptr=referenceptr.next;
        }
        while(referenceptr.next!=null){
            headptr=headptr.next;
            referenceptr= referenceptr.next;
        }
        return referenceptr;
    }
}
