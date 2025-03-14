class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int len = nums1.length-1;
        while(n>=0){
            if(m>=0 && nums1[m]>nums2[n]){
                nums1[len--]=nums1[m--];
            }
            else nums1[len--]=nums2[n--];
        }
    }
}