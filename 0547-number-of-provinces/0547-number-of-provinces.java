class Solution {


    public void bfs(int[][] matrix, boolean[] visited, int source){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source]  = true;

        while(!q.isEmpty()){
            int removed = q.poll();

            for(int i=0; i< matrix.length; i++){
                if(matrix[removed][i] ==1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }



    public int findCircleNum(int[][] matrix) {
        int n= matrix.length;

        boolean[] visited = new boolean[n];
        int count =0;

       
       for(int i=0; i< n; i++){
        if(!visited[i]){
            count++;
             bfs(matrix, visited, i);
        }
       }
       return count;



        
    }
}