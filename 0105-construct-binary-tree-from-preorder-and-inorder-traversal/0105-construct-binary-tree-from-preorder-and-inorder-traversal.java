import java.util.HashMap;



class Solution {
    int preIndex = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

      
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        
        return buildTreeHelper(0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;  }

     
        TreeNode root = new TreeNode(preorder[preIndex++]);

        int inIndex = inorderMap.get(root.val);

        root.left = buildTreeHelper(inStart, inIndex - 1);
        root.right = buildTreeHelper(inIndex + 1, inEnd);

        return root;
    }



    
}
