class Solution {

    public int countCommas(int n) {

        int len = String.valueOf(n).length();
        if(len < 4){
            return 0;
        }

        int comma = n -1000 + 1;

        return comma;

        
    }
}