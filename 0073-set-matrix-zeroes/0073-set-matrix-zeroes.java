class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean[] visitedRow = new boolean[matrix.length];
        boolean[] visitedCol = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    visitedRow[i] = true;
                    visitedCol[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(visitedRow[i] || visitedCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}