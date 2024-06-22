class Solution {
    public int smallestEvenMultiple(int n) {
        int ans =0;
        if(n==1){
            ans=2;
        }
        for(int i=1; i<= n; i++){
            if((i* n)% 2==0 ){
                ans = i*n;
                break;
            }
        }
        return ans;
        
    }
}