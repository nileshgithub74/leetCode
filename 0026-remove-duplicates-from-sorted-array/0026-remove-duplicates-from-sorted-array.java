class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int x  : nums){
            if(!set.contains(x)){
                set.add(x);
            }
        }
        int i =0;
        for(int num: set){
            nums[i++] = num;
        }
        
        return set.size();
    }
}