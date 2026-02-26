
class Solution {
    int postOrderIndex ;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n  = postorder.length;
        postOrderIndex = n-1;

        for(int i =0; i <n; i++){
            map.put(inorder[i], i);
        }

        return solve( postorder, 0, n-1);

    }

    public TreeNode solve(int[] postorder, int start, int end){
        if(start > end){
            return null;
        }

        int rootval  = postorder[postOrderIndex--];

        int inorderIndex = map.get(rootval);

        TreeNode root = new TreeNode(rootval);

        root.right = solve(postorder, inorderIndex+1, end);
        root.left = solve(postorder, start, inorderIndex-1);

   return root;


    }
}