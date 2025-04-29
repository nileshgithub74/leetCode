class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int  n : nums){
            if(n> 0){
                hs.add(n);
            }
        }

        int missing = 1;
      
        while(true){
            if(!hs.contains(missing)){
               return  missing;

            }missing++;
        }
       
        
    }
}