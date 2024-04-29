package 力扣题;

import java.util.HashMap;
import java.util.Map;

public class Solution105 {
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

    private Map<Integer,Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode result = new TreeNode(preorder[0]);
        if (preorder.length == 1) return result;
        int id = 0;
        int pd = 0;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < preorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNodeDG(preorder, inorder, pd, indexMap.get(preorder[pd]), result);
        return result;
    }

    void TreeNodeDG(int[] preorder, int[] inorder, int pd, int id, TreeNode treeNode) {
        if (pd + 1 <= preorder.length - 1) {
            if (id>0){
            treeNode.left = new TreeNode(preorder[pd + 1]);
            id= indexMap.get(preorder[pd+1]);
            TreeNodeDG(preorder, inorder, pd+1, id , treeNode.left);
            }else{
                treeNode.right = new TreeNode(preorder[pd + 1]);
                treeNode.left = null;
                id= indexMap.get(preorder[pd+1]);
                TreeNodeDG(preorder, inorder, pd+1, id , treeNode.right);
            }
        }
        if (pd + 2 <= preorder.length - 1 && id>0) {
            treeNode.right = new TreeNode(preorder[pd + 2]);
            id= indexMap.get(preorder[pd+2]);
            TreeNodeDG(preorder, inorder, pd+2, id , treeNode.right);
        }
    }
}
