class Solution {
    public int firstMatchingIndex(String s) {

        int  n = s.length();
        char[] arr = s.toCharArray();
       

        for(int i=0;i  < n; i++){
              if(arr[i] == arr[n-i-1]){
                return i;
              }
        }
       
        return -1;
    }
}