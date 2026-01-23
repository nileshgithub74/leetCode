class Solution {

    public int FirstOcurr(int[] arr, int x){
        int n = arr.length;
        int low =0;
        int high = arr.length -1;
        int ans = -1;

        while(low <= high){
            int mid = (low+ high)/2;

            if(arr[mid] == x){
                ans =mid;
                high = mid-1;
            }

            if(arr[mid] < x){
               
                low = mid+1;
            }else{
               high = mid-1;
            }
        }
        return ans;

    }

     public int LastOcurr(int[] arr, int x){
        int n = arr.length;
        int low =0;
        int high = arr.length -1;
        int ans = -1;

        while(low <= high){
            int mid = (low+ high)/2;

            if(arr[mid] == x){
                
                ans =mid;
                low =mid+1;
            }

            if(arr[mid] > x){
               
                high = mid-1;
            }else{
               
                low = mid+1;
            }
        }
        return ans;

    }


    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;

        int first = FirstOcurr(arr, target);
        int second = LastOcurr(arr, target);
        int[] result =  new int[2];
        result[0] = first;
        result[1] =second;
        return result;


        
    }
}