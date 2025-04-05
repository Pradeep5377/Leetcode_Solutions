class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int n2 = 1;
        System.out.println(n1+"\n"+n2);
        for(int i = 2;i<=n;i++){
            int ans = n1+n2;
            System.out.println(ans);
            n1 = n2;
            n2 = ans;
        }
        return n2;
    }
}