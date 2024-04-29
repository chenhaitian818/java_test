package 力扣题;

import 算法.二叉树.Tree;

public class Solution230 {

    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        new Solution230().kthSmallest(treeNode,3);
    }

    int sign = 0;//记录节点数量
    int help = 0;//记录第二次节点走了几步
    int ans = 0;//标记第二次递归需要走到第几个节点
    int result=0;//记录答案
    public int kthSmallest(TreeNode root, int k) {
        definition_TreeNode_num(root); //第一次调用递归方法查询所有的节点数量用sign记录下来
        ans = sign - k+1;//确定第二次递归需要走到第几步
        help=0;
        definition_TreeNode_num(root); //再次递归
        return result;//返回答案
    }

    void definition_TreeNode_num(TreeNode root) {
        if (root.right != null) definition_TreeNode_num(root.right);
        ++sign;//中序遍历计数
        ++help;
        if (help == ans) result = root.val;
        if (root.left != null) definition_TreeNode_num(root.left);
    }
}
