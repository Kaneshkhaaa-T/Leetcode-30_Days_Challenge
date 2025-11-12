/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private int isSameTree(TreeNode root){
            TreeNode node = root;
            if(node==null) return 0;
            int leftTree = isSameTree(node.left);
            if(leftTree == -1) return -1;
            int rightTree = isSameTree(node.right);
            if(rightTree == -1) return -1;
            if(Math.abs(leftTree-rightTree)>1) return -1;
            return Math.max(leftTree,rightTree) + 1;

    }
    public boolean isBalanced(TreeNode root) {
        return isSameTree(root) != -1;
	}
}