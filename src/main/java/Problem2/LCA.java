package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
           if (root == null)
                return null;

            if(root.val == p.val || root.val == q.val){
                return root;
            }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }
        else {
            return left;
        }
    }
}
