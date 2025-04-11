class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int secmax = max;
        for(char ch : s.toCharArray()){
            if(ch-'0' > max && ch-'0'>=0 && ch-'0' <=9){
                secmax = max;
                max = ch-'0';
            }
            else if(ch-'0' < max && ch-'0'>secmax){
                secmax = ch-'0';
            }
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        return secmax;
    }
}