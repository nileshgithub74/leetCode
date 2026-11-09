
import java.util.*;

class Solution {

    HashMap<String, Boolean> dp = new HashMap<>();

    public boolean solve(String s1, String s2) {

        // Base case 1: Both strings are equal
        if (s1.equals(s2)) {
            return true;
        }

        // Base case 2: Different lengths
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create a unique key for this pair
        String key = s1 + "_" + s2;

        // Check if answer is already stored
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int n = s1.length();

        for (int i = 1; i < n; i++) {

            // CASE 1: No Swap
            boolean noSwap =
                    solve(s1.substring(0, i), s2.substring(0, i))
                    &&
                    solve(s1.substring(i), s2.substring(i));

            // CASE 2: Swap
            boolean swap =
                    solve(s1.substring(0, i), s2.substring(n - i))
                    &&
                    solve(s1.substring(i), s2.substring(0, n - i));

            if (noSwap || swap) {
                dp.put(key, true);
                return true;
            }
        }

        // Store false result also
        dp.put(key, false);

        return false;
    }

    public boolean isScramble(String s1, String s2) {

        dp.clear();

        return solve(s1, s2);
    }
}
