package org.example;

public class IsSymmetric {
    //accepted
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetricSol(root.left,root.right);
    }
    public boolean isSymmetricSol(TreeNode node1,TreeNode node2) {
        if(node1==null&&node2==null)return true;
        if(node1==null||node2==null) return false;
        return (node1.val==node2.val) && isSymmetricSol(node1.left,node2.right)&&isSymmetricSol(node1.right,node2.left);
    }
}
