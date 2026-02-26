class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        if (root == null)
            return result;

        List<Integer> path = new ArrayList<>();
        solve(root, path, result);

        return result;
    }

    public void solve(TreeNode root, List<Integer> path, List<String> result) {
        if (root == null)
            return;

        path.add(root.val);

        if (root.left == null && root.right == null) {


            StringBuilder sb = new StringBuilder();
            for(int i =0; i <path.size(); i++){
                sb.append(path.get(i));
                if(i != path.size()-1){
                    sb.append("->");
                }
            }

            result.add(sb.toString());

        } else {

            solve(root.left, path, result);
            solve(root.right, path, result);
        }

        path.remove(path.size() - 1);
    }
}