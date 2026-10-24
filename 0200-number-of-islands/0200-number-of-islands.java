class Solution {
    public void dfs(int sr, int sc,  char[][] grid){

        grid[sr][sc] = '0';

        int[][] direction = {{-1, 0}, {1,0}, {0,1}, {0, -1}};

        for(int i=0; i< direction.length; i++){
            int newrow = sr + direction[i][0];
            int newcol = sc + direction[i][1];

            if(newrow >=0 && newrow< grid.length && newcol >=0 && newcol <grid[0].length && grid[newrow][newcol] == '1'){
                dfs(newrow, newcol, grid);
            }

        }
    }
    public int numIslands(char[][] grid) {
        int count =0;
        int m = grid.length;
        int n= grid[0].length;

        for(int i=0; i < m; i++){
            for(int j =0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
        
    }
}