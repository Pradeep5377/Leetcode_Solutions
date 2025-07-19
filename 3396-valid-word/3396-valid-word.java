class Solution {
    public boolean isValid(String word) {
        word = word.toLowerCase();
        if(word.length() < 3) return false;

        boolean vowel = true;
        boolean con = true;
        for(int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) 
                return false;            
            
            if((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') && con) {
                if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                    con = false;
                }
            }

            if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && vowel) {
                vowel = false;
            }
        }
        return !vowel  && !con;
    }
}
