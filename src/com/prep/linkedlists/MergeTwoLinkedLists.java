package com.prep.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Merge 2 SORTED linked lists
 * @author tnaqvi
 * @date Nov 29, 2017
 */
public class MergeTwoLinkedLists {

    /**
     *HInt : THe Fake Dummy Node is the point of beginning 
     * @param lExtend the solution to merge K lists
     * @param l2
     * @return
     */
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode psuedoHead= new ListNode(0);
        //for now getting a new ptr which is pointing to the 
        ListNode ptr= psuedoHead;
        //Assuming lists are of same lenght: BC ALso Check l1 and l2 else .next throws NPE
        while(l1.next!=null || l2.next!=null){
            if(l1.val<l2.val){
                ptr.next=l1;
              //this is the mistake here since the ptr would be p l1.next=ptr; 
                //We need l1 to proceed to the next ptr which is l1.next
                l1=l1.next;
            }
            else{
                ptr.next=l2;
                l2=l2.next;
               // l2.next=ptr;
                
            }
            ptr=ptr.next;
        }
        return psuedoHead.next;
    }
    
    
    public ListNode mergeKLists(ListNode[] arrayOfListNodes){
        ListNode result= new ListNode(0);
        if(arrayOfListNodes.length==1) return arrayOfListNodes[0];
        
        else {
            for(int i=1;i<arrayOfListNodes.length-1;i++){
                result=mergeTwoLists(arrayOfListNodes[i],arrayOfListNodes[i+1]);
            }
        }
        return result;
    }
    
    //For lare computations we know MERGE SORT is the best: use it here
    public ListNode mergeSortedLists(List<ListNode> lists){
        ListNode pseudoNode= new ListNode(0);
        if(lists.size()==0 || lists.size()==1) return new ListNode(0);
        else{
          
            
            while(lists.size()>1){
               //halving the list
                int start=0;
                int end= lists.size();
                int middle=lists.size()/2;
                System.out.print("start"+start+"\t"+"middle"+middle+"\t"+"end");
                ListNode leftHalf= mergeTwoLists(lists.get(start),lists.get(middle));
                ListNode rightHalf= mergeTwoLists(lists.get(middle+1), lists.get(end));
                List list= new ArrayList();
                list.add(leftHalf);
                list.add(rightHalf);
                pseudoNode= mergeSortedLists(list);
            }
        }
        return pseudoNode;
    }
    
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    
    
}
