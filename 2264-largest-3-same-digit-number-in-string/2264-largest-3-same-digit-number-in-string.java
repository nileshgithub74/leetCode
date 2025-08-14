class Solution {
    public String largestGoodInteger(String num) {


        for(char d='9'; d >='0'; d--){
            String result = ""+d+d+d;
            if(num.contains(result)){
                return result;
            }

            
        }
        return "";

        
    }
}