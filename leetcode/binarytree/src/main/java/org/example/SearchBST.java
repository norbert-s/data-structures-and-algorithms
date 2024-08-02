package org.example;

public class SearchBST {
    //mine
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }

    }

    TreeNode searchBSTRecursive(TreeNode root, int target) {
        if (root == null || root.val == target) {
            return root;
        }
        if (target < root.val) {
            return searchBSTRecursive(root.left, target);
        }
        return searchBSTRecursive(root.right, target);
    }
}
