class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        int n = image.length;

       for(int i =0; i< n; i++){
        int start = 0;
        int end = image[i].length-1;
         while(start< end){
            int tem = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = tem;
            start++;
            end--;
            
        }

        for(int j =0; j < image[i].length; j++){
            image[i][j] = image[i][j]^ 1;
        }



       }
       return image;



       
        
    }
}