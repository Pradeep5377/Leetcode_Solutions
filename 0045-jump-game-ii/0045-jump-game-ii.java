class Solution {
    public int jump(int[] nums) {
        
        int max = 0;
        int currend = 0;
        int count = 0;
 
        for(int i=0;i<nums.length-1;i++){
            max = Math.max(max,i+nums[i]);
 
            if(i == currend){
                count++;
                currend = max;
            }
        }
        return count;
    }
}