class Solution {
    List<Integer> list = new ArrayList<>();

    public void getDigit(int n) {
        List<Integer> temp = new ArrayList<>();

        while (n != 0) {
            int digit = n % 10;
            temp.add(digit);
            n = n / 10;
        }
       
       for(int  i=temp.size()-1; i>=0; i--){
         list.add(temp.get(i));
       }

    }

    public int[] separateDigits(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            getDigit(nums[i]);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}