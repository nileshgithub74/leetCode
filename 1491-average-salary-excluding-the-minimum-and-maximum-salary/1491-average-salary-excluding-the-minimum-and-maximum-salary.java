class Solution {
    public double average(int[] salary) {

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int n = salary.length;
        int sum=0;

        for(int i=0; i < salary.length; i++){
            max = Math.max(max, salary[i]);
            min= Math.min(min, salary[i]);
            sum += salary[i];
        }
        
        double  avg =  (sum -min-max)/(n-2);
        return avg;
        
    }
}