class Solution {
    public int findLucky(int[] arr) {
        int n  = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int ans = -1;
        

        for(int x : arr){
            if(map.get(x) == x){
                ans = Math.max(ans, x);
                
            }
        }

    return ans;

        
    }
}