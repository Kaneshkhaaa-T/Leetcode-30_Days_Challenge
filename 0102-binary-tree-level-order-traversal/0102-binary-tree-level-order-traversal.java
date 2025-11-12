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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qt = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        qt.add(root);

        while(!qt.isEmpty()){
            int size = qt.size();
            List<Integer> store = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode node = qt.poll();
                store.add(node.val);
                if(node.left!=null)
                qt.add(node.left);
                if(node.right!=null)
                qt.add(node.right);
            }
            ans.add(store);
        }
        return ans;
    }
}