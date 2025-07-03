class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Integer>  map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
      
      List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                res.add(key);
                
            }
        }

        return new int[]{res.get(0), res.get(1)};


        

        
    }
}