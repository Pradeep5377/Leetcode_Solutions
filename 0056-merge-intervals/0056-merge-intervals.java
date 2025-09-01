class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        int[][] result = new int[n][2];


        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        int idx = 0;
        result[0] = intervals[0];

        for(int i=1;i<n;i++){
            if(result[idx][1]>=intervals[i][0]){
                if(intervals[i][1] > result[idx][1]){
                    result[idx][1] = intervals[i][1];
                }
            }
            else{
                idx++;
                result[idx] = intervals[i];
            }
        }


        return Arrays.copyOf(result,idx+1);
    }
}