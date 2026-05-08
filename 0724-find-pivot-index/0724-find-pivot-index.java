class Solution {
    public int pivotIndex(int[] arr) {
        int n= arr.length;

        int rightsum =0;
        for(int  x : arr){
            rightsum +=x;
        }

        int leftsum =0;

        for(int i=0; i< n; i++){
            rightsum -= arr[i];

            if(rightsum == leftsum){
                return i;
            }else{
                leftsum += arr[i];
            }
        }

        return -1;
       
        
    }
}