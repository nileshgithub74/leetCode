class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];
        int maxLen = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) { 
                if (nums1[i - 1] == nums2[j - 1]) {
                    curr[j] = prev[j - 1] + 1;
                    maxLen = Math.max(maxLen, curr[j]);
                } else {
                    curr[j] = 0;
                }
            }
            prev = curr.clone();
        }

        return maxLen;
    }
}
