class Solution {
    public int specialArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = nums[i] > max ? nums[i] :max;
        }

        for(int i=0;i<=max;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] >= i){
                    count++;
                }
            }
            if(count == i) return i;
        }
        return -1;
    }
}