class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptr1 = m - 1,ptr2=n-1;
        int index = 0;

        int len = nums1.length-1;
        while(ptr1>=0 && ptr2>=0){
            System.out.println(nums1[ptr1]);
            if(nums1[ptr1] >= nums2[ptr2]){
                nums1[len] = nums1[ptr1--];
            }
            else{
                nums1[len] = nums2[ptr2--];
            }
            len--;
        }

        while(ptr2>=0){
            nums1[len--] = nums2[ptr2--];
        }
    }
}