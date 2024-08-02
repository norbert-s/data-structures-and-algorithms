package org.example;

public class NumberOLeaves {

    //mine - checked - correct
    public int numberOfLeavesHelper(TreeNode root) {
        if (root == null) return 0;
        return numberOfLeaves(root);

    }

    public int numberOfLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) return 1;
        int count = numberOfLeaves(root.left) + numberOfLeaves(root.right);

        return count;
    }
}
