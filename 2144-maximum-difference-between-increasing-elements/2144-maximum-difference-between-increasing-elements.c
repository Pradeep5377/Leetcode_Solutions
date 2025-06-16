int maximumDifference(int* nums, int numsSize) {

    int min = nums[0]; //min = i,max = j
    int max = -1;
    for(int i = 1;i<numsSize;i++){
        if(nums[i]>min){
            if(nums[i]-min>max){
                max = nums[i]-min;
            }
        }
        else{
            min = nums[i];
        }
    }
    return max;
}