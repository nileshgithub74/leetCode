
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> distinct = new HashSet<>();
        boolean possible = true;
        for (int num : nums) {
            if (num < k) {
                possible = false;
                break;
            }
            if (num > k) {
                distinct.add(num);
            }
        }
        if (!possible) {
            return -1;
        }
        return distinct.size();
    }
}
