class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+ 1);
        }

        int sum =0;
        for(var entry : map.entrySet()){
            if(entry.getValue() % k ==0){
                sum += entry.getValue()* entry.getKey();
            }
        }
        return sum;
        
    }
}