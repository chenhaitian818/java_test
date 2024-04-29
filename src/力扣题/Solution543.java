package 力扣题;

public class Solution543 {
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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }

    public int depth(TreeNode treeNode) {
        if (treeNode == null){return 0;}
        int L=depth(treeNode.left);
        int R=depth(treeNode.right);
        ans = Math.max(ans,L+R+1);
        return Math.max(L,R)+1;
    }
}
