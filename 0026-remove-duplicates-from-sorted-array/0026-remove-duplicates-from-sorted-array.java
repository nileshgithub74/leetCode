class Solution {
    public int removeDuplicates(int[] arr) {
        int result = 1;

        for(int i =1; i< arr.length; i++){
           if( arr[i] != arr[result -1]){
             arr[result] = arr[i];
             result++;
           }
        }

        return result; 
    }
}
