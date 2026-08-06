class Solution {
    public int smallestNumber(int n, int t) {
        int small = 0;
        int prod =  0;
        for(int i=n;i<=100;i++){
            int j = i;
            prod = 1;
            while(j>0){
                int rem = j%10;
                prod = prod*rem;
                j = j/10;
            }
            if(prod%t==0){
                return i;
            }
        }
        return 0;
    }
}