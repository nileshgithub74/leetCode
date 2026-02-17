class Solution {
    public List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        for(int i=0; i<=11; i++){
            for(int j =0; j <=59; j++){

                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    String hr = String.valueOf(i);
                    String min = ( j < 10 ? "0": "") + j;

                    result.add(hr+":"+min);
                }

            }
        }

        return result;


        
    }
}