class Solution {
    public int findCircleNum(int[][] adj) {
        
        
        int n= adj.length;
        int count =0;
        boolean[] visited = new boolean[n];
        
       for(int i=0; i< n; i++){
           if(!visited[i]){
               getBfs(adj, visited, i);
               count++;
           }
       }
        return count;
        
    }

    private static void getBfs(int[][] adj, boolean[] visited, int source) {
        int n= adj.length;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            for(int i =0; i< n; i++){
                if(adj[node][i] ==1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                    
                }
            }
            
        }
        
    }
}