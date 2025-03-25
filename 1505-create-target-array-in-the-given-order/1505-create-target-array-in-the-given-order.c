/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* createTargetArray(int* nums, int numsSize, int* index, int indexSize, int* returnSize) {
    int* target = calloc(sizeof(int),numsSize);
    for(int i=0;i<numsSize;i++){
        if(target[index[i]]!=-1){
            for(int j=numsSize-1;j>index[i];j--){
                target[j]=target[j-1];
            }
        }
        target[index[i]] = nums[i];
    }
    *returnSize = numsSize;
    return target;
}