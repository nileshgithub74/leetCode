class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0]== 1 || grid[n-1][n-1] == 1){
            return -1;
        }

        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int[][] direction ={{-1,0},{1,0}, {0,1}, {0,-1}, {1,1}, {-1,-1}, {1, -1}, {-1,1}};

        Queue<int[]> q =  new LinkedList<>();
        q.add(new int[]{0,0, 1});
        dist[0][0] =1;

        while(!q.isEmpty()){

            int[] curr = q.remove();
            int row = curr[0];
            int col = curr[1];
            int distance = curr[2];

            if(row == n-1 && col == n-1){
                return dist[row][col];
            }

            

            for(int i=0; i < direction.length; i++){
                int newrow = row + direction[i][0];
                int newcol = col + direction[i][1];

                if(newrow >=0 && newrow < n && newcol >=0 &&newcol<n && grid[newrow][newcol] == 0){

                    int newdistance =  distance + 1;

                    if(newdistance < dist[newrow][newcol]){
                        dist[newrow][newcol] = newdistance;
                        q.add(new int[]{newrow, newcol, newdistance});
                    }

                }
                
            }

        }
        

        return -1;



    }
}