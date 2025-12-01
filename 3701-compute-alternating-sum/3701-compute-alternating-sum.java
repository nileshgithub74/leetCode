class Solution {
    public int alternatingSum(int[] arr) {
        int n= arr.length;
        int oddSum =0;
        int evenSum =0;

        for(int i =0; i< n; i++){
            if(i % 2 ==0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }

        return   evenSum - oddSum;
        
    }
}