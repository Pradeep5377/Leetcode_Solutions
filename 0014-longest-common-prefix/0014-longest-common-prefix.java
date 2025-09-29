class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        // Arrays.sort(strs);

        // for(int i=0;i<strs.length;i++){
        //     System.out.println(strs[i]);
        // }
        String prefix = strs[0];
        int prefixLen = prefix.length();

        for(int i=1;i<strs.length;i++){
            String curr = strs[i];

            while(!curr.startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}