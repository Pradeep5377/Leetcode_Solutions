class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int out = 0;
        int i = 1;

        while (len > 0) {
            int ans = Math.min(8, len);
            out += ans * i;
            len -= ans;
            i++;
        }

        return out;
    }
}