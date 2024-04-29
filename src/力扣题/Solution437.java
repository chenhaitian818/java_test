package 力扣题;

public class Solution437 {
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

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return 0;
        }
        long tar = (long) targetSum;
        int ret = sum_tree(root, tar);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);
        return ret;
    }

    public int sum_tree(TreeNode root, Long targetSum) {
        int ret = 0;
        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (val == targetSum) {
            ret++;
        }
        ret += sum_tree(root.left, targetSum - val);
        ret += sum_tree(root.right, targetSum - val);
        return ret;
    }
}
