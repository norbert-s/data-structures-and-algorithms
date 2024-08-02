package org.example;

public class InorderSuccessor {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        TreeNode successor = null;

        while (root != null) {

            if (p.val >= root.val) {
                root = root.right;
                //itt a kovetkezo korben az else ag fog lemenni
                //es akkor a successor a tényleges successor lesz -a jelenlegi root
            } else {
                successor = root;
                root = root.left;
            }
        }

        return successor;
    }

    //mine accepted
//    List<TreeNode> inorderSuccessornodeList = new ArrayList<>();
//
//    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//        if(root==null) return null;
//        inorderSuccessorSol(root);
//        for(int i=0;i<inorderSuccessornodeList.size();i++){
//            if(inorderSuccessornodeList.get(i).val>p.val){
//                return inorderSuccessornodeList.get(i);
//            }
//        }
//
//        return null;
//
//    }
//    public void inorderSuccessorSol(TreeNode root) {
//        if(root.left!=null){
//            inorderSuccessorSol(root.left);
//        }
//
//        inorderSuccessornodeList.add(root);
//        if(root.right!=null){
//            inorderSuccessorSol(root.right);
//        }
//
//    }
}
