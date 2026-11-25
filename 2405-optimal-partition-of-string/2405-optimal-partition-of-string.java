class Solution {
    public int partitionString(String s) {

        int n = s.length();
        int max = 1;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {

            if (freq[ch - 'a'] == 1) {
                max++;
                Arrays.fill(freq, 0);

            }

            freq[ch - 'a']++;
        }

        return max;

    }
}