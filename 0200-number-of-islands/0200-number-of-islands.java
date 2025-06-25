class Solution {

    private void bfs(char[][] grid, int i, int j ){
        Queue<int[]> q = new  LinkedList<>();
        q.add( new int[]{i,j});

        grid[i][j] = 'V';

        while(!q.isEmpty()){
            int[] removed = q.remove();
            int x = removed[0];
            int y = removed[1];

              if (x + 1 < grid.length && grid[x + 1][y] == '1') {
                q.add(new int[]{x + 1, y});
                grid[x + 1][y] = 'V';
            }

            if(x-1 >=0 && grid[x-1][y] =='1'){
                q.add(new int[]{x-1, y});
                grid[x-1][y] = 'V';
            }

            if( y+1 < grid[0].length && grid[x][y+1] == '1'){
               q.add(new int[]{x, y + 1});
              grid[x][y+1] = 'V';  
            }


             if(y-1 >= 0 && grid[x][y-1]  == '1'){
                 q.add(new int[]{x, y -1});
              grid[x][y-1] = 'V';  
            }






        }
    

    }



    public int numIslands(char[][] grid) {
        if(grid == null ||  grid.length == 0){
            return 0;
        }

        int row =  grid.length;
        int col = grid[0].length;
        int count = 0;


        for(int i = 0; i< row; i++){
            for(int j = 0 ; j< col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid, i, j );
                }
            }

        }
        return count;
        
    }
}