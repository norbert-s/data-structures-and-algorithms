package org.example;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
    List<Integer> list = new ArrayList<>();
    //mine accepted
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        kthSmallestFunc(root);
        return listKthSmallest.get(k-1);
    }
    List<Integer> listKthSmallest = new ArrayList<>();
    public void kthSmallestFunc(TreeNode root) {

        if(root.left!=null){
            kthSmallestFunc(root.left);
        }
        list.add(root.val);

        if(root.right!=null){
            kthSmallestFunc(root.right);
        }
    }
}
