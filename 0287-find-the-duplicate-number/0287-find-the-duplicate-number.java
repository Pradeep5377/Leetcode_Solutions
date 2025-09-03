class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        boolean[] seen = new boolean[n+1];

        for(boolean b : seen){
            System.out.print(b+" ");
        }
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(seen[num]){
                return num;
            }
            else{
                seen[num] = true;
            }
        }
        return 0;
    }
}