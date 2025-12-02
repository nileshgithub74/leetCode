class Solution {
    public int[] sortArrayByParity(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int  x : nums){
            list.add(x);
        }

        list.sort((a,b)->{
            return Integer.compare(a%2, b%2);
        });

       int index =0;
       int[] arr = new int[list.size()];
        for(int x :list){
            arr[index++] = x;
        }
        return arr;


        
    }
}