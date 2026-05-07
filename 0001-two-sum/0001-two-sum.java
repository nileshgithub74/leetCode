class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< n; i++){
            int required = target-arr[i];
            if(map.containsKey(required)){
                return new int[]{  map.get(required), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}