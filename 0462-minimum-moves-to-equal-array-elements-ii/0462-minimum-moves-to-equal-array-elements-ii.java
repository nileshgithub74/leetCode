class Solution {
    public int minMoves2(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        int median  = arr[n/2];
            
       int result =0;
        for(int x : arr){
            result += Math.abs(median -x);
        }

        return result;
        
    }
}