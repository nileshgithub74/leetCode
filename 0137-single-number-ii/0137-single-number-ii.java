class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twoes = 0;

        for(int num : nums){
            ones = (ones ^ num) & ~twoes;
            twoes = (twoes ^ num )& ~ones;

        }
        return ones;
        
    }
}