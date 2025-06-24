class Solution {
    public int majorityElement(int[] nums) {

     int n = nums.length;
     int ans=0;
        int count =1;
        int  element = nums[0];
        for(int i =1; i< n; i++){
            if(nums[i] == element){
                count++;
            }else{
                count--;
            }
            if(count ==0){
                element = nums[i];
                count =1;
            }
        }


        int  majcount =0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]  == element){
                count ++;
            }
        }

    if(count > n/2 ){
        ans = element;
    }
      else{
        ans = -1;
      }
      

        


       
      
    

        
    return ans;
    }
}