class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();

        int orginal = n;
        int rem =0;
        int power = 1;
        
        while( n  >0){
            rem = n%10;
           int   reverse = rem * power;
          if(reverse>0) list.add(reverse);
           
           n = n/10;
           power = power * 10;
            

        }

        Collections.reverse(list);

         int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;


        
    }
}