class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = 0;
        int count =0;

        for(int x : arr){
            if(count == 0){
                candidate = x;
                
            }
             if(x == candidate){

                count++;
            }else{
                count--;
            }
        }

        count =0;
        for(int x : arr){
            if(x == candidate){
                count++;
            }
        }
        int ans= 0;
        if(count > n/2)
            ans = candidate;
        
        return ans;
        
    }
}