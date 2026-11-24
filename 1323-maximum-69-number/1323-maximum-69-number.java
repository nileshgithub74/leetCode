class Solution {
    public int maximum69Number(int num) {

        int original = num;
        int place = 0;
        int index = -1;

        while (num != 0) {
            int remainder = num % 10;

            if (remainder == 6) {
                index = place;

            }
            place++;
            num = num / 10;
        }

        if (index == -1) {
            return original;
        }
        int ans = original +  3 * (int)Math.pow(10, index);
        return ans;

    }
}