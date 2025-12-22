class Solution {
    public int countSegments(String str) {


        int count =0;

        if(str.length() > 0 && str.charAt(0) != ' '){
            count++;
        }

        for(int i =1; i < str.length(); i++){
            if(str.charAt(i) != ' ' && str.charAt(i- 1) == ' '){
                count++;
            }

        }

        return count;


       
    }
}