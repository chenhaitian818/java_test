package 力扣题;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {
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


    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        if (root.left != null) inorderTraversal(root.left);
        list.add(root.val);
        if (root.right != null) inorderTraversal(root.right);
        return list;
    }
}
