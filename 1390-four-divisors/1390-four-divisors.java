class Solution {
    public static int find(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if(i  * i == n){
                    count ++;
                }else{
                    count +=2 ;
                }
            }
        }
        return count;
    }

    public int sum(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if(i * i == n){
                    sum += i;
                }else{
                    sum += i + ( n/i);
                }
            }
        }
        return sum;
    }

    public int sumFourDivisors(int[] nums) {

        int n = nums.length;
        int ans= 0;

        for (int i = 0; i < n; i++) {
            if (find(nums[i]) == 4) {
                 ans += sum(nums[i]);

            }
        }
        return ans;

    }
}