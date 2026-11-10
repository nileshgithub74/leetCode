class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        HashSet<Integer> set = new HashSet<>();

        int rept = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ed = grid[i][j];

                if (set.contains(ed)) {
                    rept = ed;

                } else {
                    set.add(ed);
                }

            }
        }
        int missing = 1;

        for (int i = 1; i <= n * n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[] { rept, missing };
    }
}