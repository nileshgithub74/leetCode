class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < min) {
                min = arr[mid];
                index = mid;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {

                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return min;
    }
}