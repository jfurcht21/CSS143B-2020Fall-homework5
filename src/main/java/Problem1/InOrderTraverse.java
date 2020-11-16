package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {

    //Used reference https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> newStack = new Stack<>();

        while(root != null || newStack.size() > 0) {

            while (root != null) {
                newStack.push(root);
                root = root.left;
            }
            root = newStack.pop();
            result.add(root.val);

            root = root.right;

        }
        return result;
    }
}
