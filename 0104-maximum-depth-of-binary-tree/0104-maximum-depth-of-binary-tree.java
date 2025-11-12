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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> qt = new LinkedList<>();
       int ans = 0;
        if (root == null) {
            return ans;
        }
        qt.add(root);

        while(!qt.isEmpty()){
            int size = qt.size();
            for(int i =0;i<size;i++){
                TreeNode node = qt.poll();
                if(node.left!=null)
                qt.add(node.left);
                if(node.right!=null)
                qt.add(node.right);
            }
            ans++;
        }
        return ans;
    }
}