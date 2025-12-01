class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        boolean isfound = false;
        int ans =0;
        int i=k;
        while(!isfound){
            if(!set.contains(i)){
                ans = i;
                isfound = true;
                
            }
            i = i+k;
        }

        return ans;



        
        
    }
}