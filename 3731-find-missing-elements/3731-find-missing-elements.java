class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] freq = new int[101];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            if(nums[i]>=max){
                max = nums[i];
            }
            freq[nums[i]]++;
        }

        for(int i=0;i<101;i++){
            if(freq[i]==0 && i>=min && i<=max){
                list.add(i);
            }
        }
        return list;
    }
}