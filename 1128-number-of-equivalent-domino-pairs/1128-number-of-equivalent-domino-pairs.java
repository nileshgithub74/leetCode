import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int key = a < b ? a * 10 + b : b * 10 + a; // Normalize to 2-digit key
            
            int currCount = map.getOrDefault(key, 0);
            count += currCount; // Each previous occurrence of this key forms a valid pair
            map.put(key, currCount + 1);
        }
        
        return count;
    }
}
