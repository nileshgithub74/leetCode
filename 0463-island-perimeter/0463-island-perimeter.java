class Solution {
    public int dfs(int sr, int sc, int[][] grid){
         int  m = grid.length;
        int n = grid[0].length;
        int count =0;

        int[][] direction = {{-1,0}, {1,0}, {0,1}, {0,-1}};

        for(int i=0; i< 4; i++){
            int newrow = sr + direction[i][0];
            int newcol = sc + direction[i][1];

            if(newrow < 0 || newrow >=m || newcol < 0 || newcol >= n || grid[newrow][newcol] == 0){
                count++;
            }


        }
   return count;

    }

    public int islandPerimeter(int[][] grid) { 
        int res =0;
        int  m = grid.length;
        int n = grid[0].length;
        for(int i=0;i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] ==1 ){
                   res +=  dfs(i , j, grid);
                   
                }

            }
        }
        return res  ;
    }
}