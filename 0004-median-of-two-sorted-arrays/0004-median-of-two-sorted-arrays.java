class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int[] merge = new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length ;i++){
            merge[j]=(nums1[i]);
            j++;
        }
        for(int i=0;i<nums2.length ;i++){
            merge[j]=(nums2[i]);
            j++;
        }
        //Sorting
        /*for(int k=0;k<merge.length-1;k++){
            for(int i=0;i<merge.length-k-1;i++){
                if(merge[i]>=merge[i+1]){
                    int temp = merge[i];
                    merge[i] =merge[i+1];
                    merge[i+1] = temp; 
                }
            }
        }
        */
        Arrays.sort(merge);
        int len = merge.length;
        //odd count
        if(len%2==1) median=merge[len/2];
        //even count
        else{
            int sum = merge[len/2]+merge[(len/2)-1];
            median=sum/2.0;
        }
        return median;
    }
}