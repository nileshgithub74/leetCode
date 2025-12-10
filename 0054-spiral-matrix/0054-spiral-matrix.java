class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result =  new ArrayList<>();


        int m = arr.length;
        int n  = arr[0].length;

        int top =0;
        int left=0;
        int right = n-1;
        int bottom = m-1;

    while(left<= right && top <= bottom){
      for(int j =left; j<= right;j++){
            result.add(arr[top][j]);
        }
        top++;


        for(int i =top; i <= bottom ; i++){
            result.add(arr[i][right]);
        }
        right--;

        if(top <=bottom){
            for(int j = right; j>=left; j--){
                result.add(arr[bottom][j]);
            }
        }
        bottom--;

        if(left<= right){
            for(int i=bottom ; i>=top; i--){
                result.add(arr[i][left]);

            }
            left++;
        }
    }










     return result;
        
    }
}