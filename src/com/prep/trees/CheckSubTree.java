package com.prep.trees;
/**
 * Problem Statement
 * T1 and T2 are large binary trees, T1 is bigger than T1.
 * Create an algo to determine if T2 is a subtree of T1 such that if T1 is cut from node n,it is identical to t2
 * @author tnaqvi
 *
 */
public class CheckSubTree {
    
    
    boolean containsTree(BinaryTree.TreeNode tree1, BinaryTree.TreeNode tree2){
        if(tree1==null) return false;// large tree is empty
        else if( tree2==null) return true; //Empty t2 is a Subtree --Edge case
        if(tree1.data==tree2.data){
           return matchTrees(tree1,tree2); //match the tree nodes if the given tree nodes data match
        }
        
        return false;
    }
    
    /**
     * Write a recursive function to match the trees if the data of the nodes match
     */
    public boolean  matchTrees(BinaryTree.TreeNode t1,BinaryTree.TreeNode t2){
        boolean flag= false;
        if(t1.data==t2.data){
              flag=matchTrees(t1.left,t2.left) && matchTrees(t1.right,t2.right);
        }
        else if(t1==null || t2==null) {
           flag= false;
        }
        return flag;
    }

}
