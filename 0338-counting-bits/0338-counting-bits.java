class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];

        for(int i=0;i<=n;i++){
            res[i] = count1Bits(i);
        }
        return res;
    }
    private static int count1Bits(int n){

        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}