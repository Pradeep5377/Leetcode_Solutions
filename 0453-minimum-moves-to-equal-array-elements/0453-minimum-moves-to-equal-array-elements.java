class Solution {
    public int minMoves(int[] nums) {
        int sum = 0,max = 0,min = Integer.MAX_VALUE;

        for(int i:nums){
            // max = Math.max(i,max);
            min = Math.min(i,min);
            sum+=i;
        }
        // return (max*nums.length) - sum;
        return sum - min*nums.length ;
    }
}

// We should make all the array elements equals to the Maximum value...So we are multiplying the maximum value with n (length) so that the max value is distributed for all the elements and we are subtracting the avalaible values in the array..... hence we get the remaining moves to make the array equal...