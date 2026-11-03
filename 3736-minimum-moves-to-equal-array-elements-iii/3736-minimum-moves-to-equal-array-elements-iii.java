class Solution {
    public int minMoves(int[] arr) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(x, max);
        }
        int result =0;

        for(int x : arr){
            result += Math.abs(max -x);
        }
        return result;
    }
}