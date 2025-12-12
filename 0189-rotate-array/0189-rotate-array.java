class Solution {
    public void rotate(int[] nums, int d) {
        int n  = nums.length;
        d = d%n;
        int[] arr = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = nums[(i-d+n) %n];
        }
      int index =0;
        for(int x : arr){
            nums[index++] = x;
        }

       

        
    }
}