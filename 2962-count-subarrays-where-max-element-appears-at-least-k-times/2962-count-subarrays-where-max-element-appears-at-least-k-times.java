
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int maxCount = 0;
                for (int l = i; l <= j; l++) {
                    if (nums[l] == maxVal) {
                        maxCount++;
                    }
                }
                if (maxCount >= k) {
                    count++;
                }
            }
        }
        return count;
    }
}
