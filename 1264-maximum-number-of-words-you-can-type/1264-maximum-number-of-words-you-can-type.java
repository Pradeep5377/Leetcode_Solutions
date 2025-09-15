class Solution {
    public int canBeTypedWords(String text, String brokenLetters){
        int[] freq = new int[26];
        for(int i=0;i<brokenLetters.length();i++){
            freq[brokenLetters.charAt(i) - 'a']++;
        }
        int count = 0;
        boolean found = true;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) != ' '){
                System.out.println(freq[text.charAt(i) -'a']);
                if(freq[text.charAt(i) - 'a'] > 0){
                    found = false;
                }
            }
            if(text.charAt(i) == ' '){
                if(found == true) {
                    count++;
                }
                found = true;
            }

        }
        if(found) count++;
        return count;
    }
}