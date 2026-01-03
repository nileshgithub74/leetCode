import java.util.ArrayList;
class Solution {
    public int removeElement(int[] nums, int val) {
       List<Integer> list = new ArrayList<>();

       for(int x : nums){
        if( x != val){
            list.add(x);
        }
       }
       int index = 0;
       for(int num : list){
        nums[index++] = num;
       }


        return list.size();
    }
}