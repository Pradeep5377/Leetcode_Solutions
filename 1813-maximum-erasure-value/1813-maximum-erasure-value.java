class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        Set<Integer> set = new HashSet<>();
        int currsum = 0;
        int maxsum = 0;
        for(int right = 0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currsum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currsum += nums[right];
            maxsum = Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}