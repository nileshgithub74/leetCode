class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String result ="";
        
        String first = strs[0];
        String last = strs[strs.length-1];

        int i=0; int j=0;

        while(i < first.length() && j < last.length()){
            if(first.charAt(i) == last.charAt(j) ){
                result += first.charAt(i);
                i++; j++;
            }else{
                 break;
            }
        }

        return result;
        
    }
}