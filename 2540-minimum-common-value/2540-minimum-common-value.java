class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int ans =Integer.MAX_VALUE;

        for(int x : nums1){
            set.add(x);
        }

        for(int  y : nums2){
            if(set.contains(y)){
                ans = Math.min(ans, y);

            }

        }

         return ( ans == Integer.MAX_VALUE) ? -1  : ans;


   
        
    }
}