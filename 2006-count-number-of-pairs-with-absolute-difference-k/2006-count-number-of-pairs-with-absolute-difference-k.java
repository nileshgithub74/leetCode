import java.util.HashMap;

class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int required1 = nums[i] - k;
            int required2 = nums[i] + k;

            if (map.containsKey(required1)) {
                count += map.get(required1);
            }
             if (map.containsKey(required2)) {
                count += map.get(required2);
            }


            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
