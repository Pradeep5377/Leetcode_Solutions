class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j = n-1;

        if(i==-1){
            rev(nums,0,n-1);
        }
        else{
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            //Swap 
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            //reverse;
            rev(nums,i+1,n-1);
        }
        System.out.println(i + " " + j);
    }
    private static void rev(int[] nums, int start,int end){
            while(start < end){
                int tem = nums[start];
                nums[start] = nums[end];
                nums[end] = tem;
                start++;
                end--;
            }
    }
}