class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0,right = matrix[0].length - 1;

       
        while(left < matrix.length && right >= 0){
            int mid = matrix[left][right];

            if(mid == target){
                return true;
            }
            else if(target > mid){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}