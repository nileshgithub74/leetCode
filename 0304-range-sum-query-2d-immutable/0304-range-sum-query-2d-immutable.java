class NumMatrix {
    int[][] ps;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ps = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                ps[i][j] = matrix[i -1 ][j- 1] + ps[i - 1][j]+ ps[i][j - 1] - ps[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
         return ps[row2 + 1][col2 + 1]
             - ps[row1][col2 + 1]
             - ps[row2 + 1][col1]
             + ps[row1][col1];
    }
}
