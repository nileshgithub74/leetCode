class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : tasks) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int total = 0;
        for (int e : map.values()) {
            if (e == 1) {
                return -1;
            }
            if (e % 3 == 0) {
                total += e / 3;
            } else {
                total +=  e / 3 + 1;
            }
        }
        return total;

    }
}