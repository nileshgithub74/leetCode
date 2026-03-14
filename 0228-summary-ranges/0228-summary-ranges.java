class Solution {
    public List<String> summaryRanges(int[] arr) {
       List<String> result = new ArrayList<>();
        int n= arr.length;
        int i=0;

        while(i < n){
            int start = arr[i];

            while(i<n-1 && arr[i]+1  == arr[i+1]){
             i++;
            }
            int end = arr[i];

            if(start == end){
                result.add(start + "");
            }else{
                result.add(start +"->"+ end);
            }
            i++;
        }

        return result;

        
    }
}