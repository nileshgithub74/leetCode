import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

       
        for (int num : nums) {
            if (hs.contains(num)) {
                hs.remove(num); 
            } else {
                hs.add(num);
            }
        }
        
        for(int x: hs){
            return  x;
        } 
        return -1;
    }
}
