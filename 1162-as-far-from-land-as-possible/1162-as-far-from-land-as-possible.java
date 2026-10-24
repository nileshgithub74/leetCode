class Solution {
    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int time = -1;
        Queue<int[]> q = new LinkedList<>();
        int[][] height = new int[m][n];
        int land = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    q.add(new int[] { i, j });

                } else {
                    height[i][j] = -1;
                }
            }
        }
        if (land == 0 || land == m * n) {
            return -1;
        }

        int[][] dir = {
                { -1, 0 }, { 1, 0 },
                { 0, -1 }, { 0, 1 }
        };

        while (!q.isEmpty()) {
            int size = q.size();
            time++;
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for (int d = 0; d < 4; d++) {
                    int nr = r + dir[d][0];
                    int nc = c + dir[d][1];

                    if (nr >= 0 && nr < m &&
                            nc >= 0 && nc < n &&
                            height[nr][nc] == -1) {

                        height[nr][nc] = height[r][c] + 1;
                        q.add(new int[] { nr, nc });
                    }
                }

            }
            
        }

        return time;
    }
}