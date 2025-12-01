class Solution {
    public long removeZeros(long n) {
       String s = Long.toString(n);
        s = s.replace("0", "");
        s = s.trim();
        long ans = Long.parseLong(s);
        return ans;



        
    }
}