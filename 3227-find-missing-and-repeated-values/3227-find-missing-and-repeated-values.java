class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] visited =new boolean[grid.length*grid.length+1];
        int[] ans = new int[2];
        int sum = 0;
        for(int[] arr : grid){
            for(int val : arr){
                if(visited[val]){
                    ans[0] = val;
                }
                else{
                    visited[val]=true;
                    sum=sum+val;
                }
            }
        }
        int n = grid.length;
        int totalsum = (n*n*(n*n+1))/2;
        ans[1] = totalsum-sum;
        return ans;
    }
}