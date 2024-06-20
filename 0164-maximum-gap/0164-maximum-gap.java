class Solution {
    public int maximumGap(int[] arr) {

        if(arr.length < 2){
            return 0;
        }
        Arrays.sort(arr);

        int diff = arr[0];
        for(int i=1; i< arr.length; i++){
            int ans = arr[i] - arr[i-1];

            diff = Math.max(diff, ans);
        }
        return diff;

        
    }
}