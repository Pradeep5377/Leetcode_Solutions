class Solution {
    public int numIslands(char[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    markZero(grid,i,j,r,c);
                }
            }
        }
        return count;        
    }
    private static void markZero(char[][] grid,int i,int j,int r, int c){
        if(i<0 || j<0 || i>=r || j>=c){
            return;
        }
        if(grid[i][j]=='0') return;
        grid[i][j] ='0';
        markZero(grid,i-1,j,r,c);
        markZero(grid,i+1,j,r,c);
        markZero(grid,i,j-1,r,c);
        markZero(grid,i,j+1,r,c);
    }
}