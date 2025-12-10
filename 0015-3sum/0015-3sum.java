class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);  

        Set<List<Integer>> st = new HashSet<>();  

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                if (seen.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    st.add(temp); 
                }

                seen.add(arr[j]);
            }
        }

        return new ArrayList<>(st);
    }
}
