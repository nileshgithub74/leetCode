class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[]visited = new boolean[n];

        bfs(rooms, visited, 0);

        for(var x : visited){
            if(x == false){
                return false;
            }
        }

        return true;
    }
     private static void bfs(List<List<Integer>> rooms, boolean[] visited, int source) {

        int n = rooms.size();

        Queue<Integer> q = new LinkedList<>();
        q.add(source);visited[source] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            for(int neigh : rooms.get(node)){
                if(!visited[neigh]){
                    visited[neigh] =true;
                    q.add(neigh);
                }
            }
        }
    }
}