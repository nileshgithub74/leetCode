class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            
            max = Math.max(max, arr[i]);
        }
        int low = 1;
        int high = max+k;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                count++;
            }

            if (count == k) {
                return i;
            }
        }
        return -1;

    }
}