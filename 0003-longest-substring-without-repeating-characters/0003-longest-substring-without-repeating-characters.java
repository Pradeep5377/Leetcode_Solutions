class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,max = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = max > (i-left + 1) ? max : i-left+1;
        }
        return max;
    }
}