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
    
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        int leftH = checkHeight(root.left);
        int rightH = checkHeight(root.right);

// passing through the node
        int dia = leftH + rightH;

        // not passing through the node;

        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);


        return Math.max(dia, Math.max(leftDia, rightDia));


        
    }


    public  int checkHeight(TreeNode root){
        if(root == null) return 0;

        int left = checkHeight(root.left);

        int right = checkHeight(root.right);

     return Math.max(left,right)+1;


    }
}