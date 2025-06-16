class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs  = new HashMap<>();

        int left = 0; int maxlen = 0;

        for(int right=0; right< s.length(); right++){
            char c = s.charAt(right);
            if( hs.containsKey(c)){
                left =  Math.max( hs.get(c) + 1, left);
            }

            hs.put(c,right);
            maxlen = Math.max(maxlen,right-left+1);
        }
        


    return maxlen ;



        
    }
}