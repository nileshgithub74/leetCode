class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum =0;
         int count =0;


        for(int i =0; i < n; i++){
            prefixsum += nums[i];
            int required = prefixsum - k;

            if( map.containsKey(required)){
                count += map.get(required);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);

        }


    return count;



        
    }
}