class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        int longest =0;

         HashSet<Integer> set =new HashSet<>();
         for(int x : nums){
            set.add(x);
         }

         for(int num : set){
            if(!set.contains( num-1)){
                int curr = num;
                int count = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    count++;
                }
                longest = Math.max(count, longest);

            }
         }
         return longest;
        
    }
}