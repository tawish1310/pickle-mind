package com.prep.ctci_ds.stringProblems;

import java.util.HashMap;

/*
 * Used for String searching/matching/manipulation for 
 * large data set eg: Type ahead, Predictive search etc
 */
public class Tries {

    
    public void insert(String word){
       
        TrieNode node=new TrieNode();//needs to fix
        
        for(int i=0;i<word.length();i++){
            HashMap<Character, TrieNode> map = node.getChildren();
            if(!map.containsKey(word.charAt(i))){
                TrieNode newNode= new TrieNode();
                map.put((word.charAt(i)), newNode);
            }
        }
        node.setComplete(true);
    }
    
    
    class TrieNode{
        boolean isComplete;
        private HashMap<Character,TrieNode> children; //used to store the children of the 
        public HashMap<Character, TrieNode> getChildren() {
            return children;
        }
        public void setChildren(HashMap<Character, TrieNode> children) {
            this.children = children;
        }
        public boolean isComplete() {
            return isComplete;
        }
        public void setComplete(boolean isComplete) {
            this.isComplete = isComplete;
        }
      
    }
}
