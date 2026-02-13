class Solution {
    public int hIndex(int[] arr) {

        int n= arr.length;
        int count =0;
        Arrays.sort(arr);

        for(int i =0; i <n; i++){

            if(arr[i] > i){
                count++;
            }
            
            
        }
        return count;
        
    }
}