class Solution {
    public boolean isPalindrome(int x) {
      
      if(x <0){
        return false;
      }
     
     int n =x;
     int reversed =0;
      while(n !=0){
        int digit= n %10;
        reversed = reversed * 10 + digit;
         n = n/10;
        
      }

      if(reversed == x){
        return true;
      }

    return false;
    }
}