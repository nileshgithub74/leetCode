import java.util.*;

class Solution {
    public int findShortestSubArray(int[] arr) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        // Count frequency and find degree
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            max = Math.max(max, map.get(x));
        }

        int ans = n;

        // Check all numbers having maximum frequency
        for (int key : map.keySet()) {

            if (map.get(key) == max) {

                int first = -1;
                int last = -1;

                // Find first occurrence
                for (int i = 0; i < n; i++) {
                    if (arr[i] == key) {
                        first = i;
                        break;
                    }
                }

                // Find last occurrence
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] == key) {
                        last = i;
                        break;
                    }
                }

                int len = last - first + 1;

                ans = Math.min(ans, len);
            }
        }

        return ans;
    }
}