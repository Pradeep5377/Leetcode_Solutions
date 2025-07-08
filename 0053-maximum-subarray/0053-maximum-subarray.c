int maxSubArray(int* nums, int numsSize) {
    int sum = 0,maxsum=nums[0];


    for(int i=0;i<numsSize;i++){
        if(sum<0){
            sum = 0;
        }
        sum+=nums[i];

        if(sum>maxsum) maxsum = sum;
    }   
    return maxsum;
}