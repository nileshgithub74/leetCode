class Solution {
    public int repeatedNTimes(int[] arr) {

        int n  = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        };

        int result = 0;

        for(var x : map.entrySet()){
            if( x.getValue() > 1){
                result = x.getKey();
            }
        }

    

    return result;
        


        
    }
}