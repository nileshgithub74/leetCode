class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        double ans = Integer.MAX_VALUE;

        int i =0;
        int j = arr.length-1;
        while(i  <j){
         double  average = (double)(arr[i]+ arr[j])/2;
            ans = Math.min(average, ans);
            i++;
            j--;
        }
        
     return ans;
    }
}