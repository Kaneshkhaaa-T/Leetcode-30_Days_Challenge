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
    public List<Integer> preorderTraversal(TreeNode root) {
         Stack<TreeNode> st = new Stack<>();
           TreeNode node = root;
           List<Integer> ans = new ArrayList<>();
           if (root == null) {
            return ans;
        }
            st.push(node);
           while(true){
            if(node!=null){
                node = st.pop();
                ans.add(node.val);
                // System.out.print(node.data);
                // System.out.print(" wait ");
                if(node.right!=null)
                st.push(node.right);
                if(node.left!=null)
                st.push(node.left);

                node = node.left;

            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                 ans.add(node.val);
                if(node.right!=null)
                st.push(node.right);
                if(node.left!=null)
                st.push(node.left);
                node = node.left;

            }
        }
        return ans;
    }
}