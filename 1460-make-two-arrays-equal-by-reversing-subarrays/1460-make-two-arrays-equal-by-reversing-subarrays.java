class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      int n  = arr.length;
        Arrays.sort(target);
        Arrays.sort(arr);

        int  i=0;
        int  j =0;
        while(i < n && j < n ){
            if(arr[i] != target[i]){
               return false;
            }

            i++;
            j++;
        }


        return true;
        
    }
}