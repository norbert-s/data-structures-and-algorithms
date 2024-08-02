package org.example;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addValBase(10);
        binaryTree.addValBase(4);
        binaryTree.addValBase(7);
        binaryTree.addValBase(15);
        binaryTree.addValBase(3);
        binaryTree.addValBase(8);
        binaryTree.addValBase(11);
        binaryTree.addValBase(20);
        binaryTree.addValBase(1);

//       binaryTree.inorderTraversal(binaryTree.getRoot());
//        System.out.println(binaryTree.searchBST(binaryTree.getRoot(),4).val);
//        System.out.println(binaryTree.isValidBST(binaryTree.getRoot()));
//        System.out.println(binaryTree.min(binaryTree.getRoot()));
//        System.out.println(binaryTree.max(binaryTree.getRoot()));

//        binaryTree.deleteNode(binaryTree.getRoot(),4);
//        binaryTree.inorderTraversal(binaryTree.getRoot());

//        System.out.println(binaryTree.heightOfTree(binaryTree.getRoot()));
//
//        List<Integer> list = binaryTree.postorderTraversal(binaryTree.getRoot());
//        System.out.println(list);
        //binaryTree.levelOrderTraversal(binaryTree.getRoot());
//        List<List<Integer>> list= binaryTree.levelOrder(binaryTree.getRoot());
//        System.out.println(list);

        //System.out.println(binaryTree.numberOfLeavesHelper(binaryTree.getRoot()));

//        List<String> numberOfPaths =  binaryTree.binaryTreePaths(binaryTree.getRoot());
//        System.out.println(numberOfPaths);
       // System.out.println(binaryTree.inorderSuccessor(binaryTree.getRoot(),new TreeNode(15)).val);
    }
}
