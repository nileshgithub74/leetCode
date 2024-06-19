class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
       int sum = n* (n+1)/2;
       int sumOfArray=0;

       for(int i=0; i< arr.length; i++){
        sumOfArray += arr[i];

       }
       int missingNumber = sum- sumOfArray;
       return missingNumber;
        
    }
}