class Solution {
    public boolean possible(int[] arr, int maxsum, int k) {
        int spilt = 1;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxsum) {
                return false;
            }

            if (currsum + arr[i] <= maxsum) {
                currsum += arr[i];
            } else {
                spilt++;
                currsum = arr[i];
            }

        }
        if (spilt <= k) {
            return true;
        }
        return false;
    }

    public int splitArray(int[] arr, int k) {

        int n = arr.length;
        if (n < k)
            return -1;

        int low = -1;
        int high = 0;

        for (int x : arr) {
            low = Math.max(x, low);
            high += x;
        }
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;

    }
}