class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        DFS(root, targetSum, path, result);
        return result;
    }

    void DFS(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) return;

        path.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(path));
        } else {
            DFS(root.left, targetSum - root.val, path, result);
            DFS(root.right, targetSum - root.val, path, result);
        }

        path.remove(path.size() - 1); // backtrack
    }
}
