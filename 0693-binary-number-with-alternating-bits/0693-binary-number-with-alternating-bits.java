class Solution {
    public boolean hasAlternatingBits(int n) {

        int result = n ^ (n >>1);

        //  check all bits are one if yes return  

        return ((result & (result+1 ))== 0);
        
    }
}