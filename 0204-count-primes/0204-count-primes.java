class Solution {
    public int countPrimes(int n) {
        boolean[] seive = new boolean[n+1];
        Arrays.fill(seive,true);
        if(n==0 || n==1) return 0;
        seive[0]=seive[1] = false;

        for(int i=2;i*i<=n;i++){
            if(seive[i]){
                for(int j= i*i;j<=n;j+=i){
                    seive[j] = false;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(i+"-->"+seive[i]);
        // }
        int count = 0;
        for(int i=2;i<n;i++){
            if(seive[i]){
                count++;
            }
        }
        return count;
    }
}