class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0,j=matrix[0].length-1;
        for(int k =0;k<matrix.length;k++){
            if((matrix[i][j] >= target && matrix[i][0] <=target) || k==matrix.length-1){
                break;
            }
            i++;
            
        }
        System.out.println(i);
        for(int k = 0;k<matrix[0].length;k++){
            if(matrix[i][k] == target) return true;
        }
        return false;
    }
}