class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;

        List<Integer> result = new ArrayList<>();

        HashSet<Integer> set  = new HashSet<>();

        for(int x : arr){
            set.add(x);
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }

    
return result;
    }
}