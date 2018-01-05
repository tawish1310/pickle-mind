package com.prep.trees;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Find the first common Ancestor of two nodes in a binary Tree.Avoid storing additonal nodes in a DS
 * @author tnaqvi
 *
 */
public class CommonAncestor {
/**
 * Its easier to store the prev node(parent) and compare the children of both the trees:
 * A lot of times the TreeNode class is modified to include another parent Pointer since the InputNode provided
 * can be any node other than the root node
 * BUT w/o modifying the TreeNode class we can find the LCA by using the rootNode: THis will be a comparison
 * with the rootNode data and the left/right data
 */
    /** 
     *Need to have the root node(either defined or passed) along with the two nodes provided as input
     * @param a
     * @param b
     * @return
     */
    
    public TreeNode LCA_without_parent_input(TreeNode root,TreeNode n1,TreeNode n2){
        TreeNode left,right;
        if(root==null) return root;
        else if(root==n1||root==n2) return root;
        else{
          left=LCA_without_parent_input(root.left, n1, n2) ;
          right=LCA_without_parent_input(root.right, n1, n2);
        }
        if(left!=null && right!=null) return root;
        else
            return (left!=null?left:right);
    }
    
    
    public static void main(String[] args){
        CommonAncestor ca = new CommonAncestor();
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.left= new TreeNode(6);
        root.right.right= new TreeNode(7);
        TreeNode node=ca.LCA_without_parent_input(root, root.left.left,root.left.right);
        System.out.println(node.data);
        
        TreeNode node2=ca.lca_with_parent( root.left.left, root.left.right);
       System.out.println(node2.data);
        
        TreeNode node3=ca.LCA(root.left.left,root.left.right);
        System.out.println(node3.data);
        
    }
    /**
     * ANother solution if Links to Parents are given
     * 1. Find Depth of the tree O(n) each node atleast traversed once
     */
    
    int getDepth(TreeNode node){
        int depth=0;
        while(node!=null){
        node=node.parent;
        depth++;
        }
        
         return depth;
    }
    
    /** 
     * need more explanantion for this one : Try using a hashmap
     * @param n1
     * @param n2
     * @return
     */
    TreeNode lca_with_parent(TreeNode n1,TreeNode n2){
        int diff=Math.abs(getDepth(n1)-getDepth(n2));
        
        TreeNode node1=diff>0?n1:n2;
        TreeNode node2=diff>0?n2:n1;
        node2=moveUp(node1,diff);
        
        while(node1!=node2 && (node2!=null && node1!=null)){
            node1=node1.parent;
            node2=node2.parent;
        }
        return node1==null || node2==null ?null: node1;
    }
    
    TreeNode moveUp(TreeNode node,int diff){
        TreeNode parentNode=node;
        while(node!=null && diff>0){
            parentNode=node.parent;
            diff--;
        }
       
        return parentNode;
    }
    
    TreeNode LCA
    (TreeNode n1, TreeNode n2) 
    {
        // Creata a map to store ancestors of n1
        Map<TreeNode, Boolean> ancestors = new HashMap<TreeNode, Boolean>();
 
        // Insert n1 and all its ancestors in map
        while (n1 != null) 
        {
            ancestors.put(n2, Boolean.TRUE);
            n1 = n1.parent;
            
        }
 
        // Check if n2 or any of its ancestors is in
        // map.
        while (n2 != null) 
        {
            if (ancestors.containsKey(n2) != ancestors.isEmpty())
                return n2;
            n2 = n2.parent;
        }
 
        return null;
    }
    
    /**
     * WE can use Maps to store the Parent nodes and set value as True or false
     * Refer the following link 
     * http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-tree-set-2-using-parent-pointer/
     */
    
    /*public Map commonParent(BinaryTree.TreeNode a,BinaryTree.TreeNode b){
        //Lets find a
        System.out.println(a.data);
        HashMap<BinaryTree.TreeNode,BinaryTree.TreeNode> map= new HashMap<BinaryTree.TreeNode,BinaryTree.TreeNode>();
        if(a!=null || b!=null){
            map.put(a.left,a);
            map.put(a.right, a);
            map.put(b.left,a);
            map.put(b.right, a);
        }
        return map;
        
    }
    
    public boolean isCommonParent(BinaryTree.TreeNode a,BinaryTree.TreeNode b,Map map){
        System.out.println(a.data+"::"+b.data);
        Iterator<Map.Entry<BinaryTree.TreeNode,BinaryTree.TreeNode>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<BinaryTree.TreeNode,BinaryTree.TreeNode> pair = it.next();
            if(pair.getKey()!=null)
            System.out.println(pair.getKey().data+"::"+pair.getValue().data);
        }
        if(map.get(a)==map.get(b)){
            return true;
        }
        return false;
    }
  */
}
