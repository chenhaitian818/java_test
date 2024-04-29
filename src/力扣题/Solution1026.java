package 力扣题;

public class Solution1026 {
    public static void main(String[] args) {
        class TreeNode {
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

            public int maxAncestorDiff(TreeNode root) {
                return dfs(root,root.val,root.val);
            }

            public int dfs(TreeNode root,int min,int max){
                if (root==null){
                    return 0;
                }
                int diff=Math.max(Math.abs(root.val-min),Math.abs(root.val-max));
                min=Math.min(min,root.val);
                max=Math.max(max,root.val);
                diff=Math.max(diff,dfs(root.left,min,max));
                diff=Math.max(diff,dfs(root.right,min,max));
                return diff;
            }
        }
    }
}
