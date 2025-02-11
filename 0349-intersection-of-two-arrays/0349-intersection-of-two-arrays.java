class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();


        for(int x : nums1){
            hs.add(x);
        }
        for(int num : nums2){
            if(hs.contains(num)){
                ans.add(num);
            }
        }

        int[] result =new int[ans.size()];
        int k =0; 

       for(int num :ans){
        result[k++] = num;
        
       }


        return  result;
    }
}