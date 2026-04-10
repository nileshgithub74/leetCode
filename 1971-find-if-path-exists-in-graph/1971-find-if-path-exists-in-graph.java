class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {

        List<List<Integer>> adj   =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
    adj.add(new ArrayList<>());
}

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

           adj.get(u).add(v);
           adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        bfs(visited, adj, start);

        return visited[end];

    }

    public void bfs(boolean[] visited, List<List<Integer>> adj, int source){
        int n= adj.size();
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] =true;

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i : adj.get(node)){
                if(!visited[i]){
                    visited[i] =true;
                    q.add(i);
                }


            }
        }
    }
}