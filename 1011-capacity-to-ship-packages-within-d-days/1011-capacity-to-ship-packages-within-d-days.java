class Solution {
    public boolean possible(int[] arr, int capacity, int day) {

        int days = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum <= capacity) {
                continue;
            } else {
                sum = arr[i];
                days++;

            }
        }

        if (days <= day) {
            return true;
        }

        return false;

    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int x : weights) {
            low = Math.max(low, x);
            high += x;
        }
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}