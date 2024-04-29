package 力扣题;

public class Solution226 {
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

    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        if (root.right!=null||root.left!=null){
            TreeNode help = new TreeNode();
            help=invertTree(root.left);
            root.left=invertTree(root.right);
            root.right=help;
        }
        return root;
    }
}
