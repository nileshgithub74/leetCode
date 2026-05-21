class Solution {
    public int[] constructTransformedArray(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {

            int newIndex = ((i + arr[i]) % n + n) % n;

            res[i] = arr[newIndex];
        }

        return res;
    }
}