class Solution {
    public int longestConsecutive(int[] nums) {
         int n = nums.length;

          HashSet<Integer> set = new HashSet<>();
          for(int x  : nums){
            set.add(x);
          }
       
       int maxCount =0;
          for(int x :nums){
            if(!set.contains(x-1)){
                int curr = x;
                int count =1;
                
                while(set.contains(curr + 1)){
                    count++;
                    curr++;
                }
                maxCount = Math.max(count, maxCount);
            }
          }
        return maxCount;
        
    }
}