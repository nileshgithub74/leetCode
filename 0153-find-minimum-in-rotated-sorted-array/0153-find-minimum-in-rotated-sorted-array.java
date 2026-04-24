class Solution {
    public int findMin(int[] arr) {

        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == ans) {
                ans = arr[mid];
                index = mid;
            }
            // checek which part is sorted;

            if(arr[low] <= arr[mid]){
                
                if(arr[low]< ans){
                    ans = arr[low];
                    index =low;
                }
                low =mid+1;
            }else{
                
                if(arr[mid] < ans){
                    ans = arr[mid];
                    index =mid;

                }
                high = mid-1;
            }

          

        }
        return ans;

    }
}