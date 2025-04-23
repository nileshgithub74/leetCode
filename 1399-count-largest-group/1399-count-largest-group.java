
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> groupSizes = new HashMap<>();
        int[] counts = new int[37];
        int maxCount = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            counts[sum]++;
            maxCount = Math.max(maxCount, counts[sum]);
        }

        int largestGroupCount = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                largestGroupCount++;
            }
        }

        return largestGroupCount;
    }

    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
