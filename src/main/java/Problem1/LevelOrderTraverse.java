package Problem1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * I used an ArrayDeque because according to documentation it would be faster than a LinkedList in this
 * context. "This class is likely to be faster than Stack when used as a stack, and faster than
 * LinkedList when used as a queue." Reference: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
 */

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> newQueue = new ArrayDeque<>();
        newQueue.add(root);
        while(newQueue.size() > 0) {
            int queueSize = newQueue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < queueSize; i++) {
                TreeNode<Integer> currentNode = newQueue.remove();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    newQueue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    newQueue.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
