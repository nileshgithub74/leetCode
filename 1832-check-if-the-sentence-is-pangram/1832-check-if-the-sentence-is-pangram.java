class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();

     boolean[] result = new boolean[26];

     for(int i=0; i< n; i++){
        char ch = sentence.charAt(i);

        if(ch >='a' && ch<= 'z'){
            result[ch -'a'] = true;
        }
        if(ch >='A' && ch <= 'Z'){
            result[ch-'A'] = true;
        }
     }

     for(int i=0;i< 26; i++){
        if(result[i]== false){
            return false;
        }
     }
     return true;
        
    }
}