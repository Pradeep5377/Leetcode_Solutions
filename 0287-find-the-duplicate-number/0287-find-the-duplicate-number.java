class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        for(int num :nums){
            if(seen[num]){
                return num;
            }
            seen[num] = true;
        }
        return 0;
    }
}