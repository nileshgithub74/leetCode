
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =0;

        while(!q.isEmpty()){
            int size = q.size();
              level++;

            for(int i=0; i < size; i++){
                TreeNode curr = q.poll();
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null)q.add(curr.right);

            
            }
          
        }
        return level;
        
    }
}