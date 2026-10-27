class Solution {
    public int maximumUnits(int[][] box, int trucksize) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < box.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < box[0].length; j++) {
                row.add(box[i][j]);
            }
            list.add(row);
        }

        list.sort((a, b) -> Integer.compare(b.get(1), a.get(1)));
       int ans = 0;
        for(int i=0; i < list.size(); i++){
              int size = Math.min(trucksize,  list.get(i).get(0));
              int value = list.get(i).get(1);

              ans += size * value;

              trucksize -= size;
              if(trucksize == 0){
                break;
              }
        }
        return ans;

    }
}