class Solution {
    public int[] transformArray(int[] nums) {
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0) count++;
        }

        Arrays.fill(nums,0,count,0);
        Arrays.fill(nums,count,nums.length,1);
        return nums;
    }
}