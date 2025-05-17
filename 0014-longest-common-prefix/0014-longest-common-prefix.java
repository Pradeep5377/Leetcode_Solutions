class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int prefixLen = prefix.length();

        for(int i=1;i<strs.length;i++){
            String curr = strs[i];

            while(prefixLen > curr.length() || !prefix.equals(curr.substring(0,prefixLen))){
                prefixLen--;
                if(prefixLen==0) return "";

                prefix = prefix.substring(0,prefixLen);
            }
        }
        return prefix;
    }
}