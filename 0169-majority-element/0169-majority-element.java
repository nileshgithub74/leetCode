class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
             else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

       count =0;
        for(int x: arr){
            if(x == candidate){
                count++;
            }
        }
        int result = -1;
        if(count > n/2){
            result = candidate;
        }

          return result;

    }
}