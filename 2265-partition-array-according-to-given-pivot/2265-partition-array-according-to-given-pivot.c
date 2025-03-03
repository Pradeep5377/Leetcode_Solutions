/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) {
        int* result = (int*)malloc(numsSize*sizeof(int));
        int firstindex= 0,lastindex=numsSize-1;
        for(int i = 0,j=numsSize-1;i<numsSize &&j>=0;i++,j--){
            if(nums[i]<pivot){
                result[firstindex++] = nums[i];
            }
            if(nums[j]>pivot){
                result[lastindex--] = nums[j];
            }
        }
        while(firstindex<=lastindex){
            result[firstindex++]= pivot;
        }
        *returnSize = numsSize;
        return result;
}