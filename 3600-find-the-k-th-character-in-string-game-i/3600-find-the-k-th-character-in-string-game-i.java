class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");

        while(sb.length() < k){
            int len = sb.length();
            for(int i=0;i<len;i++){
                char ch = sb.charAt(i);
                sb.append((char)((ch - 'a' + 1)%26 + 'a'));
            }
        }
        return sb.charAt(k-1);
    }
}