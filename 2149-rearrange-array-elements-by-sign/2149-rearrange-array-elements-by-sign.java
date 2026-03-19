class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n= arr.length;

        int[] result = new int[n];

        int even =0;
        int odd =1;
        
        for(int i=0; i< n; i++){
            if(arr[i] >=0){
                result[even] = arr[i];
                even = even +2;
            }else{
                result[odd] = arr[i];
                odd +=2;
            }
        }

        for(int i =0; i< n; i++){
            arr[i] = result[i];
        }

         return result;
        
    }
}