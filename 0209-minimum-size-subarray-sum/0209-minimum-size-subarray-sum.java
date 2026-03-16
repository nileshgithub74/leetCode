class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int start =0;
        int end =0;
        int n = nums.length;
       
        int sum=0;
        int len = Integer.MAX_VALUE;
        while(end < n){
            sum += nums[end];

            while( sum >= k  && start <= end){
                len = Math.min(len, end-start+1);
                 sum -=  nums[start];
                 start++;
            }

           

            end++;

        }
      return (len == Integer.MAX_VALUE) ? 0 : len;
        
    }
}