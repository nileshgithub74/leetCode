class Solution {
    public int search(int[] arr, int k) {
    
   int ans = -1;
    for(int i=0; i< arr.length ; i++){
        if(k == arr[i])
           ans =i;

    }
    return ans;


        
    }
}