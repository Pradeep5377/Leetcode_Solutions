class Solution {
    public int majorityElement(int[] nums) {
        int count = 0,cand = 0;

        for(int i:nums){
            if(count==0){
                cand = i;
            }
            if(cand == i){
                count++;
            }
            else count--;
        }  
        return cand;
    }
}