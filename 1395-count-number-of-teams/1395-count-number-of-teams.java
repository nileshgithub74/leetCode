class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftCount = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftCount++;
                }
            }
            int rightCount = 0;
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    rightCount++;
                }
            }
            count = count + (leftCount * rightCount);
            leftCount = i - leftCount;
            rightCount = ((n - i - 1) - rightCount);
            count = count + (leftCount * rightCount);
        }
        return count;
    }
}
