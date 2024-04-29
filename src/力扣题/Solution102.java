package 力扣题;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return lists;
        ArrayDeque<TreeNode> queue1 = new ArrayDeque<>();
        queue1.add(root);
        ArrayDeque<TreeNode> queue2 = new ArrayDeque<>();
        while (queue1.size() != 0 || queue2.size() != 0) {
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            while (queue1.size() != 0) {
                if (queue1.peekFirst().left != null) queue2.addLast(queue1.peekFirst().left);
                if (queue1.peekFirst().right != null) queue2.addLast(queue1.peekFirst().right);
                list.add(queue1.peekFirst().val);
                queue1.removeFirst();
            }
            if (list.size() != 0) lists.add(list);
            while (queue2.size() != 0) {
                if (queue2.peekFirst().left != null) queue1.addLast(queue2.peekFirst().left);
                if (queue2.peekFirst().right != null) queue1.addLast(queue2.peekFirst().right);
                list2.add(queue2.peekFirst().val);
                queue2.removeFirst();
            }
            if (list2.size() != 0) lists.add(list2);
        }
        return lists;
    }
}
