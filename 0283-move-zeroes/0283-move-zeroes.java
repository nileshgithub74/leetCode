class Solution {
    public void moveZeroes(int[] arr) {
        int n =arr.length;
        int index=0;

        for(int i=0; i < n; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];

            }
        }
        for(int i= index; i<n; i++){
            arr[i] = 0;
        }



        
    }
}