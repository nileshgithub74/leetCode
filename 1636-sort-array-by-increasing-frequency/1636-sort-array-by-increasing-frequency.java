class Solution {
    public int[] frequencySort(int[] arr) {
        int n  = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num: arr){
            list.add(num);
        }


        // compare the list
        list.sort((a,b)->{
            int compare = Integer.compare(map.get(a), map.get(b));
            if(compare == 0){
                return Integer.compare(b,a);
            }
            return compare;
        });

        int[] result = new int[arr.length];
        
        int index =0;
        for(int x : list){
            result[index++] =x;
        }


        return result;


        
    }
}