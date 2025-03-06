class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] freq=new int[grid.length*grid.length+1];
        int[] ans = new int[2];
        for(int[] arr : grid){
            for(int val : arr){
                freq[val]++;
                if(freq[val]>1){
                    ans[0] = val;
                }
            }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}