
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        if (a > 0) pq.add(new int[]{a, 'a'});
        if (b > 0) pq.add(new int[]{b, 'b'});
        if (c > 0) pq.add(new int[]{c, 'c'});

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int count = curr[0];
            char ch = (char) curr[1];

            if (sb.length() > 1 && sb.charAt(sb.length() - 1) == ch && sb.charAt(sb.length() - 2) == ch) {
                if (pq.isEmpty()) break;
                int[] next = pq.poll();
                int nextCount = next[0];
                char nextCh = (char) next[1];

                sb.append(nextCh);
                next[0]--;
                if (next[0] > 0) pq.add(next);
                pq.add(curr);
            } else {
                sb.append(ch);
                curr[0]--;
                if (curr[0] > 0) pq.add(curr);
            }
        }
        return sb.toString();
    }
}
