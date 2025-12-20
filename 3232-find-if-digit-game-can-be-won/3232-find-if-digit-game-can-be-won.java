class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;    
        int sumg = 0;   
        int total = 0;

        for (int x : nums) {
            total += x;

            if (x >= 1 && x <= 9) {
                sum += x;
            } else if (x >= 10 && x <= 99) {
                sumg += x;
            }
        }

        
        if (sum > total - sum) {
            return true;
        }

        
        if (sumg > total - sumg) {
            return true;
        }

        return false;
    }
}
