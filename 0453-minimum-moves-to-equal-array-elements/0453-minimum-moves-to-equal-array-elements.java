class Solution {
    public int minMoves(int[] arr) {
        int n = arr.length;
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int x : arr){
            min = Math.min(min, x);
            sum += x;
        }
        int result = sum - n * min;
        return result;
        
    }
}