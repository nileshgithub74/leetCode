class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int x : nums) {
            if (x != val)
                nums[index++] = x;
        }

        return index;
    }
}