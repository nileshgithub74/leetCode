class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a,b)->a[0]-b[0]);
        int n = points.length;

       if( n==0) return 0;

       int currEnd = points[0][1];
       int count =1;

       for(int i=1; i < n; i++){

        if(points[i][0] > currEnd){
            count++;
            currEnd =  points[i][1];

        }else{
            currEnd = Math.min(currEnd, points[i][1]);
        }

       }

       return count;
        
    }
}