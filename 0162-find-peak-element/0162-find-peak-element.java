class Solution {
    public int findPeakElement(int[] nums) {
    
        int ans =0;
        int i=0;
           if (nums[0] > nums[1]) return 0;
                   if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        for( i=1; i< nums.length-1; i++){
            if(nums[i] > nums[i-1]  && nums[i] > nums[i+1]){
                ans = i;
                break;


            }
        }
        return i;
        
    }
}