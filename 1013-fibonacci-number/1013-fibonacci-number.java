class Solution {
    public int fib(int n) {
        if(n==0) return 0; 
        int n1 = 0;
        int n2 = 1;
        for(int i =2;i<=n;i++){
            int ans = n1+n2;
            n1 = n2;
            n2 = ans;
        }
        return n2;
    }
}