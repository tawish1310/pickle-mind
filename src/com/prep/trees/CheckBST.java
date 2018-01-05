package com.prep.trees;
/**
 * Check if a given Binary tree is a Binary Search tree
 * : For a tree to be a BST left<=current<=right
 * Use recursion to check the  i
 * @author tnaqvi
 *
 */
public class CheckBST {
    
    boolean checkBST(BinaryTree.TreeNode root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
    boolean check(BinaryTree.TreeNode n, int min, int max){
        if(n==null)
            return true;
        if(n.data <= min || n.data >= max)
            return false;
        return check(n.left, min, n.data)   //used the technique of comparing the left node data with min
            && check(n.right, n.data, max); //used the tech of comparing the right node with max
    }

}
