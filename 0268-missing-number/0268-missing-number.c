int missingNumber(int* nums, int numsSize) {
    int n = numsSize;
    int ans = (n*(n+1))/2;
    int res = 0;
    for(int i=0;i<numsSize;i++){
        res+=nums[i];
    }
    return ans-res;
}