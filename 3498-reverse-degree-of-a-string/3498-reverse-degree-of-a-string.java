class Solution {
    public int reverseDegree(String s) {    
        int sum =0;
        int index=1;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            System.out.print(ch + " ");
            int charvalue = ch -'a';
            System.out.print(charvalue + " ");

            int reverseValue= 26- charvalue;
            int product =  index * reverseValue;
            sum += product;
            index++;

        }
        return sum;
        
    }
}