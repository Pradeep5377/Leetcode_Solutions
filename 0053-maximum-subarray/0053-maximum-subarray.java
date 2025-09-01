class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum =nums[0];
        int currsum = 0;

        for(int i : nums){
            if(currsum < 0) currsum = 0;
            currsum += i;
            System.out.println(currsum);
            if(currsum > maxSum ) maxSum = currsum;
        }
        return maxSum;
    }
}