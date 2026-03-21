class Solution {
    public List<List<Integer>> generate(int numRows) {
        int num = numRows;
      List<List<Integer>> result = new ArrayList<>();
        for (int n = 0; n < num; n++) {
            ArrayList<Integer> list = new ArrayList<>();
            long res =1;

            for(int c =0; c <= n; c++){
               list.add((int) res);
                res =res* (n-c)/(c+1);
            }
            result.add(list);
        }
        return result;

    }
}