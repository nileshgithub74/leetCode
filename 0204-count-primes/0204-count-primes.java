class Solution {
    public int countPrimes(int n) {
        if(n <=1){
            return 0;
        }
        int count=0;

        for(int i =2; i< n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
      
    }



    public boolean isPrime(int n){
          if(n <=1 ){
            return false;
          }
          for(int i=2; i*i<=n; i++){
            if(n % i==0){
                return false;
            }
          }
          return true;
    }
}