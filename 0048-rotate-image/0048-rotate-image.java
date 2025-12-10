class Solution {

    public void Swap(int[][] arr, int i , int j ){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public void rotate(int[][] arr) {
        int n = arr.length;
    


        for(int  i =0; i < n ; i++){
            for(int j =i; j <n; j++ ){
                 Swap(arr,  i, j );
            }
        }


        for(int i =0; i < n; i++){
            int left =0; int right = n-1;
            while(left<= right){
                int temp = arr[i][left];
                arr[i][left]  = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
               
            }
        }


        
    }
}