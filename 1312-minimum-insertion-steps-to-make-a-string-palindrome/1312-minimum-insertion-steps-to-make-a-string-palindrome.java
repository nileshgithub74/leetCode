class Solution {
    public int lcs(String a, String b, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public int minInsertions(String s) {
        int len = s.length();

        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        System.out.print(str);

        int ans = len - lcs(s, str, len, len);
        return ans;
    }
}