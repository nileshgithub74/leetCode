class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum =0;
      HashMap<Integer, Integer> map = new HashMap<>();

       for(int x :nums){
        map.put(x, map.getOrDefault(x, 0)+1);
       }
       
       for( Map.Entry<Integer, Integer> en : map.entrySet()){
        if(en.getValue() ==1){
            sum += en.getKey();
        }
       }

     


        return sum;
    }
}