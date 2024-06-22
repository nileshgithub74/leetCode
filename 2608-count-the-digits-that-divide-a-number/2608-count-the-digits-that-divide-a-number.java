class Solution {
    public int countDigits(int num) {
        int count =0;
        int or= num;
        while(num !=0){
            int r = num %  10;
            if(or % r ==0){
                count++;
            }
        
            
            num = num / 10;
           
             
        }
        return count;
        
    }
}