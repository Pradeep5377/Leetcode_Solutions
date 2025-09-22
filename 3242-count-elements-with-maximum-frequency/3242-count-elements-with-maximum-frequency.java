class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        int max = 0;
        for(int num :nums){
            freq[num]++;
        }
        for(int i : freq){
            if(i>max) max = i;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]] == max) count++;
        }
        System.out.println(max);
        return count;
    }
}