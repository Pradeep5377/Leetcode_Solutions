class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int j = i+1;

        Arrays.sort(nums);
        while(j<=nums.length-1){
            if(nums[i]==nums[j]){
                return nums[i];
            }
            i++;
            j++;
        } 
        return 0;
    }
}