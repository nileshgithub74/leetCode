class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
      List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            long res =1;

            for(int j =0; j <= i; j++){
               list.add((int) res);
                res =res* (i-j)/(j+1);
            }
            result.add(list);
        }
        return result;

    }
}