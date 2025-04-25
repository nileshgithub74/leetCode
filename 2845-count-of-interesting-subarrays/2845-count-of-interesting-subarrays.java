class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();

        // Map to store frequency of prefix sum modulo values.
        // map[prefix_sum_mod] = count of times this prefix mod has occurred.
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // Base case: empty prefix with mod value 0

        long ans = 0L;  // To store the final count of interesting subarrays

        int sum = 0;  // Cumulative count of elements satisfying nums[i] % modulo == k
        for (int i = 0; i < n; i++) {
            // If nums[i] % modulo == k, increment the count by 1
            sum += (nums.get(i) % modulo == k) ? 1 : 0;

            // Reduce sum to within [0, modulo - 1] to avoid negatives
            sum %= modulo;

            // We want to find how many previous prefix sums had (current_sum - k + modulo) % modulo
            // This ensures that the count of qualifying elements in the subarray [j+1..i] 
            // will satisfy (count % modulo == k)
            int sp = (sum - k + modulo) % modulo;

            // Add the frequency of such prefix sums seen so far
            ans += map.getOrDefault(sp, 0);

            // Update the frequency of current prefix sum mod
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}