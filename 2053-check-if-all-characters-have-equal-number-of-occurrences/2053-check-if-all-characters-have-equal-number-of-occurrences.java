class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char chr:s.toCharArray()){
            freq[chr-'a']++;
        }   
        int len = -1;
        // int check = 1;
        for(int i=0;i<26;i++){
            if(freq[i]>0 ){
                len = freq[i];
                break;
            }
        }
            System.out.println(len);
        for(int i =0;i<26;i++){
            System.out.println(freq[i]);
            if(freq[i]!=len && freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}