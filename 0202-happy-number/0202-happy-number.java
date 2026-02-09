class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> set = new HashSet<>();

         while( n != 1){
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
                n = getNumber(n);
            }
         }
   

   return true;              
         
        
    }

    public int getNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}