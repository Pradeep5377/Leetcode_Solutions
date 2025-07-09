class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        for(int[] interval : intervals){

            /* if(overlap){

            }
            else{

            }*/
            int len = merged.size()-1;
            // No Overlapping
            if(merged.isEmpty() || merged.get(len)[1] < interval[0]){
                merged.add(interval);
            }
            
            //Overlapping
            else{
                merged.get(len)[1] = Math.max(merged.get(len)[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}