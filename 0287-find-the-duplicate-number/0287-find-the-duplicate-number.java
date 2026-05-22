class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int ans =0;

        for(int x : nums){
            if(set.contains(x)){
                ans =  x;
            }else{
                set.add(x);
            }
        }

        return ans;
        
    }
}