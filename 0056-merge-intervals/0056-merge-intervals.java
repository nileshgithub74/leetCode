class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> {
            return Integer.compare(a[0], b[0]);
        });

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {

            int nextstart = intervals[i][0];
            int nextend = intervals[i][1];

            if (nextstart <= end) {
                end = Math.max(end, nextend);
            }

            else {
                result.add(new int[] { start, end });
                start = nextstart;
                end = nextend;
            }

        }

        result.add(new int[] { start, end });
        int[][] ans = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;

    }
}