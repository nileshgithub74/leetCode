class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        int[] result = new int[nums1.length + nums2.length];

        for(int i=0; i< nums1.length; i++){
            result[i] = nums1[i];
        }

        for(int i=0; i<nums2.length; i++){
            result[nums1.length + i] = nums2[i];
        }

        Arrays.sort(result);

        int n =result.length;
        double ans =0.0;
        if(n % 2 !=0){
          int mid = n/2;
          ans = result[mid];

        }else{
           int  mid= n/2;
             ans = (result[mid-1] + result[mid]) / 2.0;
        }
        return ans;
    }
}