class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'];
        int o = freq['o' - 'a'];
        int n = freq['n' - 'a'];

        return Math.min(b, Math.min(a,
                Math.min(l / 2, Math.min(o / 2, n))));

    }
}