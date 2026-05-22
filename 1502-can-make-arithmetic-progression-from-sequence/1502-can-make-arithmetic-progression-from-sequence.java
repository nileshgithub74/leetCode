class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int i = 1;

        int d = arr[i] - arr[i - 1];
        i++;

        while (i < n) {
            int dif = arr[i] - arr[i - 1];
            if (dif != d) {
                return false;
            }i++;
        }
        return true;
    }
}