class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        int n = nums.length;
        int sum = n*(n+1);
        sum = sum /2;
        for(int i:nums) total+=i;

        return sum - total;
    }
}