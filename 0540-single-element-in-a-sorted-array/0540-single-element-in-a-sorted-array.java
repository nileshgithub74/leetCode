class Solution {
    public int singleNonDuplicate(int[] nums) {
     int result =0;
        for(int x : nums ){
            result ^= x;

        }

        return result;
        
    }
}