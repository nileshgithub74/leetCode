class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        int count=0;

        for(String x : words1){
            map.put(x, map.getOrDefault(x,0)+1);
        }

         for(String x : words2){
            map2.put(x, map2.getOrDefault(x,0)+1);
        }



         for (String key : map.keySet()) {
            if (map.get(key) == 1 && map2.getOrDefault(key,0) == 1) {
                count++;
            }
        }
        

       




        return count;


        
        
    }
}