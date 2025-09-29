class Solution {
    public int missingNumber(int[] nums) {
        int x1 = 0,x2 = 0;

        for(int i:nums) x1^= i;

        for(int i=0;i<=nums.length;i++) x2^= i;

        return x1^x2;
    }
}