class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum=0;
        int num = n;
        int ans =-1;

        while(n>0){
            int r = n% 10;
            sum += r;
            n = n /10;
        }

        if(num % sum == 0){
            ans = sum;
            
        }
        return ans;
    }
}