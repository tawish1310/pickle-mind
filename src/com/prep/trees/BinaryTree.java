package com.prep.trees;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is a Implementation of a Binary Tree
 * Binary Tree is a DS that has the root node and 2 children on L and R side
 * the LHS of the Current Root Node is less than the root Node
 * the RHS of the Current ROOt node is greather than the Node
 * Binary Search Tree is a Tree which has right<root<left i.e every right node is less than its parent and left is greater than parent
 * @author tnaqvi
 *
 */
public class BinaryTree {
    //giving the Current Node  the Calling Class responsibilty
    TreeNode rootNode= new TreeNode(); //inner class
    int size;
    
    public BinaryTree(int i) {
        this.rootNode.data=i;
    }
    
    /**
     * Adds the given node to either the L or R This is a Binart Search Tree since we are checking for L and R data
     * @param newNode
     */
   public void addNode(TreeNode root,int data){
       if(root==null){
         root = new TreeNode(data);
       }
       else {
           if (data < root.data){
           if(root.left==null) root.left= new TreeNode(data);
           else addNode(root.left,data);
           }
           else {
           if(root.right==null) root.right=new TreeNode(data);
           else addNode(root.right,data);
           }
       }
       }
      
   /**
    * Recursions for size
    * @param root
    * @return
    */
   
   public int sizeOfTree(TreeNode root){
       int size=0;
       int leftCount=root.left==null?0:sizeOfTree(root.left);
       System.out.println(leftCount);
       int rightCount=root.right==null?0:sizeOfTree(root.right);
       System.out.println(rightCount);
       size=leftCount+rightCount+1;
       
       return size;
       
   }
   /**
    * Visits the Left Node, Root Node ,Right Node
    * @param dataNode
    */
   public void inOrderTraversal(TreeNode dataNode){
       if(dataNode!=null){
      inOrderTraversal(dataNode.left);
      System.out.println(dataNode.data); // this is just printing the value to qualify as a visit
      inOrderTraversal(dataNode.right);
       }
   }
   
   /**
    * Pre Order Traversal :using recusrions
    * Visit : Root Node, Left and Right
    * @param args
    */
   public void preOrderTraversal(TreeNode dataNode){
       if(dataNode!=null){
       
      System.out.println("Pre order tRAVESAL: Visit the Current Node->Left->Right"+dataNode.data);
      inOrderTraversal(dataNode.left);
      inOrderTraversal(dataNode.right);
       }
   }
   /**
    * Post Order Traversal using recurisons
    * @param args
    */
   public void postOrderTraversal(TreeNode dataNode){
       if(dataNode!=null){
           System.out.println("Post order tRAVESAL: Visit the Right->Left->Current"+dataNode.data);
      inOrderTraversal(dataNode.right);
      inOrderTraversal(dataNode.left);
      System.out.println(dataNode.data);
     
       }
   }
   
   
   /**
    * Find Node MEthod: without recursion
    * @param args
    */
   public TreeNode findNode(TreeNode node,int nodeData){
       //We just the value of the node.data since the entire finding operation is based on re-assiging the parent to the foundNode
       //until the value of the foundNode==PassedNOde data
      
       
       while(node.data!=nodeData){
       if(nodeData<node.data){ //search on the Left of the Root Node
           System.out.println("searching left");
          node=node.left;
       }
       else{
           System.out.println("searching to right");
           node=node.right;
       }
      
       if(node==null){
           System.out.println("node doesnt exist");
           return null;
       }
       }
      
       return node;
   }
   
   public BinaryTree(){}
   
   public static void main(String[] args) {
  
       BinaryTree tree= new BinaryTree();
       TreeNode root = tree.new TreeNode(5);
       System.out.println("Binary Tree Example");
       System.out.println("Building tree with root value " + root.data);
       tree.addNode(root, 1);
       tree.addNode(root, 8);
       tree.addNode(root, 6);
       tree.addNode(root, 3);
       tree.addNode(root, 9);
       System.out.println("Traversing tree in order");
       tree.inOrderTraversal(root);
       tree.findNode(root,3);
    
    }

    
    
    
    /**
     * Read about advantages of Inner classes 
     * @author tnaqvi
     *
     */
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        
        public TreeNode getLeft() {
            return left;
        }
        public void setLeft(TreeNode left) {
            this.left = left;
        }
        public TreeNode getRight() {
            return right;
        }
        public void setRight(TreeNode right) {
            this.right = right;
        }
        
        public TreeNode(){}
        public TreeNode(int data,TreeNode leftNode,TreeNode rightNode){
            this.data=data;
            this.left=leftNode;
            this.right=rightNode;
        }
        public TreeNode(int data){
            this.data=data;
            
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        
    }
}
