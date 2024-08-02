package org.example;

public class HeightOfTree {
    public int heightOfTree(TreeNode T) {
        if (T == null) return -1;

        int resultL = heightOfTree(T.left);
        int resultR = heightOfTree(T.right);

        return Math.max(resultL, resultR) + 1;
    }
}
