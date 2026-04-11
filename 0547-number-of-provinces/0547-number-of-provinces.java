class Solution {
    public void dfs(boolean[] visited, int source, int[][] adj) {
        visited[source] = true;
        int n = adj.length;

        for (int i = 0; i < n; i++) {
            if (adj[source][i] == 1 && !visited[i]) {
                dfs(visited, i, adj);
            }

        }
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                dfs(visited, i, adj);
                count++;
            }

        }

    
    return count;
  
    }    
    
}