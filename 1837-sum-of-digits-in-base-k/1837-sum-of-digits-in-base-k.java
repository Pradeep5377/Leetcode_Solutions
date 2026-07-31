class Solution {
    public int sumBase(int n, int k) {
        int i =0;
        int ans = 0;
        while(n>0){
            int rem = n%k;
            int quo = n/k;
            ans+=rem;
            n = quo;    
        }

        return ans;
    }
}