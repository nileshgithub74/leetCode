class Solution {
    public boolean validDigit(int n, int x) {
        int original = n;

        while(n >=10){
            n = n /10;
        }

        if(n ==x){
            return false;
        }




        
        
       int num =original;
       while( num > 0){
        int digit = num %10;
        if( x == digit){
            return true;
        }
        num = num/10;
       }


       return false;
        
    }
}