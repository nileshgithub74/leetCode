class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arrS = new int[256];
        int[] arrt = new int[256];

        for(int i =0; i < s.length(); i++){
                   
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);


            if(arrS[c1] != arrt[c2])return false;

            arrS[c1] = i+1;
            arrt[c2] = i+1; 


        }

        return true;

        
        
    }
}