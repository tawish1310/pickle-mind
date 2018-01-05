package com.prep.trees;

public class TreeNode {

    public int data;
    TreeNode left;
    TreeNode right;
    //This is added only for LCA with links to parents Solution
    TreeNode parent;
    
    public void addNode(TreeNode node,int val){
        if(node==null) new TreeNode(val);
        else {
            if(node.data<val){
             node.left=node;
            addNode(node.left,val);}
            else {
                node.right=node;
                addNode(node.right,val);
            }
           
        }
    }
    
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.data=val;
        this.left=left;
        this.right=right;
    }

    public TreeNode(int val){
        this.data=val;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

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
}
