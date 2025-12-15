class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String> > map = new HashMap<>();

    for(String s : strs){
        

        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
      
      StringBuilder keyBuild = new StringBuilder();
        for(int x : freq){
            keyBuild.append('#').append(x);

        }

        String key = keyBuild.toString();

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(s);


    

        
       







    }

    return new ArrayList<>(map.values());


        
    }
}