class Solution {
    public int reverse(int  x) {
         long rev = 0;
         int n = x;
       
        while( n  != 0){
            int  r = n % 10;
             rev =  rev * 10 + r;
             n = n /10;

             if( rev> Integer.MAX_VALUE ||  rev <Integer.MIN_VALUE){
                rev = 0;
             }
              

        }
       return (int) rev;
        

        
    }
}

