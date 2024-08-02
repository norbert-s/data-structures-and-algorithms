package org.example;

public class MinMaxValue {
    public int min(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return min(root.left);
    }

    public int max(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }
        return max(root.right);
    }
}
