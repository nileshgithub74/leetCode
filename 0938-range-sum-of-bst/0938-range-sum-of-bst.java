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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode>  st = new Stack<>();

        int sum = 0;

        st.push(root);

        while(!st.isEmpty()){
            TreeNode curr = st.pop();

            if(curr == null) continue;

            if(curr.val >= low && curr.val <= high){
                sum += curr.val;
            }

            if( curr.val > low){
                st.push(curr.left);

            }
            if(curr.val < high){
                st.push(curr.right);
            }




           
        }
         return sum; }
        
    
}