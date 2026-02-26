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
      public int preorderIndex =0;
        HashMap<Integer, Integer> map  =new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        for(int i=0; i <inorder.length; i++){
            map.put(inorder[i], i);
        }

        return solve(preorder, 0, inorder.length-1);


        
    }


    public TreeNode solve(int[] preorder, int start, int end){

        if(start > end){
            return null;
        }

        int val= preorder[preorderIndex++];
        TreeNode root = new TreeNode(val);

        int inorderIndex = map.get(val);

        root.left = solve(preorder, start, inorderIndex-1);
        root.right = solve(preorder, inorderIndex+1, end);

        return root;







    }
}