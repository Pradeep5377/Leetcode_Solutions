class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n*(n+1))/2;

        int res = 0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return ans-res;
    }
}