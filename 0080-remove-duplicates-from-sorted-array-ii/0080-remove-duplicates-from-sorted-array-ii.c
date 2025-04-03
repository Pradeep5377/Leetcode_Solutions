int removeDuplicates(int* nums, int numsSize) {
    if(numsSize<=2) return numsSize;

    int ptr = 2;
    for(int i=2;i<numsSize;i++){
        if(nums[i]!=nums[ptr-2]){
            nums[ptr++] = nums[i];
        }
    }
    return ptr;
}