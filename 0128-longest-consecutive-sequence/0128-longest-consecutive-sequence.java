class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        int count =1;
        int maxCount =0;

        Arrays.sort(arr);

        for(int i=1;i<n; i++){

            if(arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] == arr[i-1] + 1){
                count++;
                maxCount = Math.max(count, maxCount);

            }else{
                break;
            }

        }

        return maxCount;
        
    }
}