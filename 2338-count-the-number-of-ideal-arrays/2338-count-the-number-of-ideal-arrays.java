import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int idealArrays(int n, int maxValue) {
        int maxLen = 14; 
        long[][] dp = new long[maxLen + 1][maxValue + 1];

      
        for (int i = 1; i <= maxValue; i++) {
            dp[1][i] = 1;
        }

        for (int len = 2; len <= maxLen; len++) {
            for (int num = 1; num <= maxValue; num++) {
                for (int mult = 2 * num; mult <= maxValue; mult += num) {
                    dp[len][mult] = (dp[len][mult] + dp[len - 1][num]) % MOD;
                }
            }
        }

      
        long[][] comb = new long[n + 1][maxLen + 1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= maxLen && j <= i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        long ans = 0;
        for (int len = 1; len <= maxLen; len++) {
            for (int last = 1; last <= maxValue; last++) {
                ans = (ans + dp[len][last] * comb[n - 1][len - 1]) % MOD;
            }
        }

        return (int) ans;
    }
}
