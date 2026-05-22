class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];
        int index =0;

        int i=0; int j = n;

        while(i < n && j < 2*n){
            result[index++] = nums[i];
            result[index++] = nums[j];
            i++;
            j++;
        }

       
        return result;
    }
}