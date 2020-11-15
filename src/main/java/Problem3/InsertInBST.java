package Problem3;

import Problem1.TreeNode;
// Reference when I hit a blocker https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
// Needed to use a helper function that returned a TreeNode
public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        insertHelper(root,valToInsert);
    }

    public static TreeNode insertHelper(TreeNode root, int valToInsert){
        if(root == null){
            root = new TreeNode<>(valToInsert);
            return root;
        }
        if(valToInsert < (int) root.val){
            root.left = insertHelper(root.left,valToInsert);
        }
        else{
            root.right = insertHelper(root.right,valToInsert);
        }
        return root;
    }
    // Code that wasn't working directly in insert()
        /*if(valToInsert > root.val){
            if(root.right == null){
                TreeNode insert = new TreeNode<>(valToInsert);
                root.right = insert;
                return;
            }
            else {
                root = root.right;
                insert(root, valToInsert);
            }
        }
        if(valToInsert < root.val || valToInsert == root.val){
            if(root.left == null){
                TreeNode insert = new TreeNode<>(valToInsert);
                root.left = insert;
                return;
            }
            else{
                root = root.left;
                insert(root, valToInsert);
            }
        }*/
        /*
        if(root == null){
            root = new TreeNode<>(valToInsert);
            return;
        }
        if(valToInsert < root.val){
            insert(root.left,valToInsert);
        }
        else{
            insert(root.right,valToInsert);
        }*/

}
