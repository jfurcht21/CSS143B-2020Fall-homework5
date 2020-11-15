package Problem1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> newQueue = new ArrayDeque<>();
        List<Integer> addResult = new ArrayList<>();

        newQueue.add(root);
        newQueue.add(null);

        while(newQueue.size() > 0){
           root = newQueue.poll();

           if(root == null){
               if(newQueue.size() == 0){
                   newQueue.add(null);

               }
           }

        }
        return result;
    }
}
