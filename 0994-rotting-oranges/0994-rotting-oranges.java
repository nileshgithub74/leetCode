class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int time = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }

        }
        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.remove();
                int row = curr[0];
                int col = curr[1];

                for (int d = 0; d < 4; d++) {
                    int newrow = row + direction[d][0];
                    int newcol = col + direction[d][1];

                    if (newrow >= 0 && newrow < m && newcol >= 0 && newcol < n && grid[newrow][newcol] == 1) {
                        fresh--;
                        grid[newrow][newcol] = 2;
                        q.add(new int[] { newrow, newcol });

                    }

                }

            }
            time++;

        }
        return fresh ==0 ? time: -1;

    }
}