class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0,j = 0;

        List<int[]> result = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            int id1 = nums1[i][0],value1 = nums1[i][1];
            int id2 = nums2[j][0],value2 = nums2[j][1];

            if(id1<id2){
                result.add(new int[]{id1,value1});
                i++;
            }
            else if(id2<id1){
                result.add(new int[]{id2,value2});
                j++;
            }
            else{
                result.add(new int[]{id1,value1+value2});
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            result.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            result.add(nums2[j]);
            j++;
        }
        int[][] res = new int[result.size()][2];
        for(int k=0;k<result.size();k++) res[k] = result.get(k);

        return res;
    }
}