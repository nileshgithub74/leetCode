class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int min = -1;
        int cap =Integer.MAX_VALUE;

        for(int i =0; i < n; i++){
            if(capacity[i] >= itemSize){
                   int nowcap= capacity[i]- itemSize;
                   if(nowcap <cap) {
                    min = i;
                    cap = nowcap;
                   }
            }

        }

        return min;

        
    }
}