package com.prep.trees;
/**
 * 
 * @author tnaqvi
 * @date Nov 24, 2017
 */
public class CheckBalancedTree {
    /**
     * A tree is balanced if the height is atmost 1
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root){
        if(root==null) return false;
        if(Math.abs(getHeight(root))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
                        
    }
    
    public int getHeight(TreeNode node){
        if(node==null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right));
    }

}
