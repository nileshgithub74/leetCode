class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {

      HashMap<Integer, Integer> map = new HashMap<>();

      for(int i =0; i< arr.length; i++){

        if(map.containsKey(arr[i])){
            int j = map.get(arr[i]);
            if(Math.abs(i-j) <= k){
                return true;
            }
            
        }

        map.put(arr[i], i);
      }
      return false;


        
    }
}