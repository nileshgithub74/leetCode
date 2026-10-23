class Solution {
    public int[] findOrder(int v, int[][] pre) {

        List<List<Integer>> adjlist = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjlist.add(new ArrayList<>());
        }

        for (int i = 0; i < pre.length; i++) {
            int a = pre[i][0];
            int b = pre[i][1];
            adjlist.get(b).add(a);
        }

        int[] indegree = new int[v];
        for (int i = 0; i < v; i++) {
            for (int neigh : adjlist.get(i)) {
                indegree[neigh]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.remove();
            result.add(curr);

            for (int neigh : adjlist.get(curr)) {
                indegree[neigh]--;

                if (indegree[neigh] == 0) {
                    q.add(neigh);
                }
            }
        }
        if (result.size() != v) {
            return new int[0];
        }
        return result.stream().mapToInt(i -> i).toArray();

    }
}