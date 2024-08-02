package org.example;

import java.util.*;

public class BinaryTree {
    Deque<TreeNode> queue = new ArrayDeque<>();
    List<Integer> list = new ArrayList<>();
    private TreeNode root;

    private int answer;

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        //itt megtalaltuk, amit le kell torolni
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.val = min(root.right);

            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }
    public int min(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return min(root.left);
    }

    public void addValBase(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            addVal(root, val);
        }
    }

    private void addVal(TreeNode root, int val) {
        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                addVal(root.left, val);
            }

        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                addVal(root.right, val);
            }
        }
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) System.out.println("tree is empty");
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        System.out.println(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
    }
}
