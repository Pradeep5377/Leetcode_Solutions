class Solution {
    public int numIslands(char[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j,r,c);
                }
            }
        }
        return count;        
    }
    private static void bfs(char[][] grid,int i,int j,int r, int c){
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {i,j});
        grid[i][j] = '0';

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] deleted = q.poll();
            for(int[] dir :directions){
                int newi = deleted[0] + dir[0];
                int newj = deleted[1] + dir[1];

                if(newi >= 0 && newj>=0 && newi<r && newj <c && grid[newi][newj]=='1'){
                    q.offer(new int[]{newi,newj});
                    grid[newi][newj] = '0';
                }
            }
        }
    }
}