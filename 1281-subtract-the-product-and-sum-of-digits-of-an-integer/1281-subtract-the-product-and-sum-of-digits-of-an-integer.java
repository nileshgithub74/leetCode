class Solution {
    public int subtractProductAndSum(int n) {

        int sum=0;
        int pro =1;
        while(n>0){
            int r = n% 10;
            sum += r;
            pro = pro *r;
            n = n/ 10;
        }
        int ans = pro -sum;
        return ans;
        
    }
}