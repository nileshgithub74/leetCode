class Solution {
    public int[] twoSum(int[] arr, int target) {

       
        int n = arr.length;

        int i=0; int j= n-1;
        int[] result = new int[2];

        while(i < j){

            if(arr[i] + arr[j] == target){
                result[0] =i+1;
                result[1] =j+1;
                return result;

            }

            else if( arr[i] + arr[j] < target){
                    i++;
            }else{
                  j--;
            }
        }
        return result;
        


    }
}