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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        // we will maintain two stack one for lefttoright and another for righttoleft traversal

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st.push(root);
        while (!st.isEmpty() || !st2.isEmpty()) {

            List<Integer> level = new ArrayList<>();

            while (!st.isEmpty()) {
                TreeNode curr = st.pop();
                level.add(curr.val);

                if (curr.left != null)
                    st2.push(curr.left);
                if (curr.right != null)
                    st2.push(curr.right);

            }

            if(!level.isEmpty())result.add(level);

            List<Integer> level2 = new ArrayList<>();

            while(!st2.isEmpty()){
                TreeNode curr =st2.pop();
                level2.add(curr.val);


                if(curr.right != null) st.push(curr.right);
                if(curr.left != null)st.push(curr.left);
            }

            if(!level2.isEmpty())result.add(level2);








        }
        return result;

    }
}