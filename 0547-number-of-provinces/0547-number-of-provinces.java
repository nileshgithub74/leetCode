class Solution {

    public void dfs(int[][] adj, boolean[] visited, int s){
        visited[s] = true;
        int n = adj.length; 

        for(int j =0; j < n ; j++){
            if(adj[s][j] ==1 && !visited[j]){
                dfs(adj, visited,j );
            }

        }



    }




    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int v = isConnected.length;

        boolean[] visited = new boolean[v];

        for(int i =0; i< v; i++){
            if(!visited[i]){
                count++;
                dfs( isConnected, visited, i);
            }
        }


        
    return count;
        
        
    }
}