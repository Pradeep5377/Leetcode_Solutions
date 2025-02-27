int removeDuplicates(int* nums, int numsSize) {
    int ptr = 0; //Pointer1
    for(int i=1;i<numsSize;i++)//i=pointer2;
    {
        if(nums[i]!=nums[ptr]){
            nums[++ptr]=nums[i];
        }
    }
    return ptr+1;//Size of the result array;
}