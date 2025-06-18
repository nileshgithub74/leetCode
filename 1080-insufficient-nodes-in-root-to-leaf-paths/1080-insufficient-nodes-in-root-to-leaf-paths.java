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

    public  static TreeNode dfs(TreeNode root, int sum, int limit){
     if (root == null) return null;


      int cursum = sum +  root.val;
      if(root.left == null && root.right == null){
        return cursum>=limit ? root : null;
      }
       

        root.left = dfs(root.left, cursum, limit);
        root.right = dfs(root.right, cursum, limit);

        if(root.left == null && root.right == null){
            return null;
        }

    
        

        return root;
        
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return dfs(root,0, limit);

        

    }
}