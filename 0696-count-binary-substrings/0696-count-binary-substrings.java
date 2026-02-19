class Solution {
    public int countBinarySubstrings(String s) {
        int n= s.length();

        int count =1;
        int prev = 0;
        int max =0;

        for(int i=1; i < n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                max += Math.min(count, prev);
                prev= s.charAt(i);
                count=1;
                
            }
        }
        return  max + Math.min(count, prev);
    }
}