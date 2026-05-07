class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count =0;
        int candidate =0;

        for(int i=0; i < n ; i++){
            if(count ==0){
                count=1;
                candidate = arr[i];

            }
            else if(arr[i] == candidate){
                count++;

            }else{
                count--;
            }
        }


        
       count =0;

        for(int i=0; i< n; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
            
            int ans=0;
        if(count >n/2){
            ans = candidate ;
        }


    return ans;



        
    }
}