package org.example;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return list;

    }

    public void traversal(TreeNode root) {
        if (root != null) {
            if (root.left != null) traversal(root.left);
            if (root.right != null) traversal(root.right);
            list.add(root.val);
        }
    }
}
