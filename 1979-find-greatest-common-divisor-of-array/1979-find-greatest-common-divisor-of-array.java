class Solution {
    public int findGCD(int[] nums) {
        
        int a = nums[0]; int b = -1;
        for(int i:nums){
            if(i<a){
                a = i;
            }
            if(i>b){
                b = i;
            }
        }
        return gcd(a,b);
    }
    private int gcd(int a, int b){

        if(b==0) return a;

        return gcd(b,a%b);

    }
}