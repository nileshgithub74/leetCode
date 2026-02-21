class Solution {

    public int CountSetBits(int n){
        int count=0;
        while(n !=0){
            n= n & (n-1);
            count++;
            
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i =2; i * i <= n; i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }


    public int countPrimeSetBits(int left, int right) {

        int count=0;

        for(int i =left; i <= right; i++){
            int result = CountSetBits(i);
            if(isPrime(result)){
                count++;
            }
        }

        return count;
        
    }
}