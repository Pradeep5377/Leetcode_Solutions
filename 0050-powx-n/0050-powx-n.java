class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if(nn<0){
            nn = -nn;
            x=1/x;
        }
        double result = 1.0;
        while(nn>0){
            if((nn&1)==1){
                result = result*x;
                nn--;
            }
            else{
                nn = nn>>1;
                x = x*x;
            }
        }
        return result;
    }
}