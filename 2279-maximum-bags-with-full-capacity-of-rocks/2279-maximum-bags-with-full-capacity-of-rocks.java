class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;

        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = capacity[i] - rocks[i];

        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (additionalRocks >= arr[i]) {
                count++;
                additionalRocks -= arr[i];
            }
        }

        return count;
    }
}