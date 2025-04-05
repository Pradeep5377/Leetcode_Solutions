class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        for(int i=3;i<=n;i++){
            int ans = n1+n2+n3;
            n1=n2;
            n2=n3;
            n3 = ans;
        }
        return n3;
    }
}