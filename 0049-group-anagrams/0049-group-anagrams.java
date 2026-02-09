class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq =  new int[26];

            for(int i=0; i <str.length(); i++){
                freq[str.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int x : freq){
                sb.append(x).append('#');
            }

            String sorted = sb.toString();



           


           

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);

        }

        return new ArrayList<>(map.values());

    }
}