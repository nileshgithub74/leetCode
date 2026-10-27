class Solution {
    public int countVowel(String str) {
        int count = 0;
        for(char s: str.toCharArray()){
              if (s == 'a') {
            count++;
        } else if (s == 'e') {
            count++;
        } else if (s == 'i') {
            count++;
        } else if (s == 'o') {
            count++;
        } else if (s == 'u') {
            count++;
        }
        }
        return count;
    }

    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();

        String a = s.substring(0, n / 2);
        int Acount = countVowel(a);

        String b = s.substring(n / 2, n);
        int Bcount = countVowel(b);

        if(Acount != Bcount){
            return false;
        }

        return true;
    }
}