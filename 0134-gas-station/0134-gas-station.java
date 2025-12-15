class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas =0;
        int totalcost =0;

        int n = gas.length;

        for(int i =0; i < n; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }

        if(totalgas< totalcost) return -1;
        int currgas =0;
        int startIndex =0;
        for(int i =0; i <n; i++){
            currgas += gas[i]- cost[i];

            if(currgas <0){   

                startIndex = i+1;
            currgas =0;

            }
        
        }

        return startIndex;

        
        
        
    }
}