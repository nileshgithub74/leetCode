class Solution {
    public int removeDuplicates(int[] arr) {
        int n= arr.length;
        int index =2;

        if(n<= 2) return n;

        for(int i =2; i< n; i++){
            if(arr[i] !=arr[index-2]){
                arr[index] = arr[i];
                index++;
            }
        }

        return index;

        
    }
}