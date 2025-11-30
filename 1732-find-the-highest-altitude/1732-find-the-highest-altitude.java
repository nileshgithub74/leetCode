class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;
        int[] all = new int[n + 1];

        all[0] = 0;

        for (int i = 1; i <=n; i++) {
            all[i] = all[i - 1] + gain[i - 1];
        }

        int max = Integer.MIN_VALUE;
        for (int x : all) {
            if (x > max) {
                max = x;
            }
        }
        return max;

    }
}