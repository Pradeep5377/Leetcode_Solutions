class Solution {
    public int minMoves(int[] nums) {
        int sum = 0,min = Integer.MAX_VALUE;

        for(int i:nums){
            min = Math.min(i,min);
            sum+=i;
        }
        return sum - min*nums.length ;
    }
}

// We should reduce all the array elements equals to the minimum value...So we are multiplying the minimum value with n (length) so that the min value is distributed for all the elements and we are subtracting the Sum from the min value of the array   h