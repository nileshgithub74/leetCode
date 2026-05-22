class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int n = startTime.length;
        int start = 0;
        int end = 0;
        int count = 0;

        while (start < n && end < n) {
            if (startTime[start] <= queryTime && queryTime <= endTime[end]) {
                count++;

            }

            start++;
            end++;
        }

        return count;

    }
}