class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int x : nums){
        map.put(x, map.getOrDefault(x,0)+1);
       }


       for(var entry : map.entrySet()){
        if( entry.getValue() > nums.length/3){
            result.add(entry.getKey());
        }
       }

       return result;



        
    }
}