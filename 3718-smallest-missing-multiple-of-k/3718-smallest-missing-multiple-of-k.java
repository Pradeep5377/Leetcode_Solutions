class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] freq = new int[1001];

        for(int i =0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i=1;i<1001;i++){
            if(freq[i]==0 && i%k==0){
                System.out.println("i = "+ i);
                return i;
            }
        }
        return -1;
    }
}