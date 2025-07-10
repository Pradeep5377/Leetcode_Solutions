class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {

        int n = startTime.length;
        int[] gaps = new int[n+1];
        int maxFree = 0;
        gaps[0] = startTime[0];
        for(int i=1;i<n;i++){
            gaps[i] = startTime[i] - endTime[i-1];
        }
        gaps[n] = eventTime-endTime[n-1];

        for(int i=0;i+k<=n;i++){
            int merge = 0;

            for(int j=0;j<=k;j++){
                merge+= gaps[i+j];
            }
            maxFree = Math.max(maxFree, merge);
        }
        return maxFree;
    }
}