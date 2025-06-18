class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int maxv=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] >min){
                maxv =Math.max(maxv,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return maxv;
    }
}