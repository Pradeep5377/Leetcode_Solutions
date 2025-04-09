class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set  = new HashSet<>();
        int count = 0;
        for(int i:nums){
            if(i<k) return -1;
            if(i>k) {
                set.add(i);
            }
        }
        return set.size();
    }
}