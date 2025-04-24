import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // number of distinct elements in whole array
        int k = (int) Arrays.stream(nums).distinct().count();
        int n = nums.length;

        Map<Integer, Integer> freq = new HashMap<>();  // counts inside current window
        int right = 0;          // right boundary of sliding window
        int complete = 0;       // how many distinct items currently present
        int ans = 0;

        for (int left = 0; left < n; left++) {
            // expand right until window becomes complete
            while (right < n && complete < k) {
                int val = nums[right++];
                freq.put(val, freq.getOrDefault(val, 0) + 1);
                if (freq.get(val) == 1) complete++;
            }

            // if window is complete, every suffix starting at 'right' works
            if (complete == k) ans += n - right + 1;

            // move left edge forward by one (shrink window from left)
            int valLeft = nums[left];
            freq.put(valLeft, freq.get(valLeft) - 1);
            if (freq.get(valLeft) == 0) {
                freq.remove(valLeft);
                complete--;          // we lost one distinct value
            }
        }
        return ans;
    }
}
