class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {

            int a = arr[i] - '0';
            int b = arr[i - 1] - '0';

            int diff = Math.abs(a - b);
            if (diff > 2) {
                return false;
            }

        }
        return true;
    }
}