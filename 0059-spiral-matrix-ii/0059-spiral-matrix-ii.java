class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int top = 0,bottom = n-1;
        int left = 0,right = n-1;
        int index = 1;
        while(top<=bottom && left<=right){
            //top 
            for(int i=left;i<=right;i++){
                result[top][i] = index++;
            }
            top++;

            //right col
            for(int i=top;i<=bottom;i++){
                result[i][right]= index++;
            }
            right--;

            //bottom approach 
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[bottom][i] = index++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    result[i][left] = index++;
                }
                left++;
            }

        }
        return result;
    }

}