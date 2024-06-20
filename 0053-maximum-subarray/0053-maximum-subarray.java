class Solution {
    public int maxSubArray(int[] arr) {

        int sum= arr[0];
        int max = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(sum >= 0){
                sum+= arr[i];
            }else{
                sum = arr[i];
            }
           
            if(sum > max){
                max = sum;
            }
           


            }
            
        return max;
        }

        
    }
