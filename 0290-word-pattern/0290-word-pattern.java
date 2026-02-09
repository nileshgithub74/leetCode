class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }

        Map<Character, String> charTOS = new HashMap<>();
        Map<String, Character> strTOC  = new HashMap<>();

        for(int i=0; i < pattern.length(); i++){
            char c1 = pattern.charAt(i);
            String c2  = str[i];

            if(charTOS.containsKey(c1) &&  !charTOS.get(c1).equals(c2) ||
               strTOC.containsKey(c2)  && strTOC.get(c2) != c1
            ){
                return false;
            }
            charTOS.put(c1, c2);
            strTOC.put(c2,c1);


        }
        return true;



        
    }
}