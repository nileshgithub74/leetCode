class Solution {
    public void rotate(int[] arr, int k) {

    int n = arr.length; 
    k = k%n;
    int index =0;
    int  temp[] = new int[n];

    for(int i = n-k; i< n; i++){
 temp[index++] = arr[i];

    }

    for(int i=0; i< n-k; i++){
        temp[index++] = arr[i];
    }
  for(int i =0; i< n; i++){
    arr[i] = temp[i];
  }
    


        
    }
}