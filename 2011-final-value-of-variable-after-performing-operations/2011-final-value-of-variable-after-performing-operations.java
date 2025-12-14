class Solution {
    public int finalValueAfterOperations(String[] operations) {

        
        int n = operations.length;
        int x =0;

        for(int i =0;i <n; i++){
            if(operations[i].contains("--")){
                 x--;

            }else if(operations[i].contains("++")){
                x++;
            }
        }

        return x;


        
    }
}