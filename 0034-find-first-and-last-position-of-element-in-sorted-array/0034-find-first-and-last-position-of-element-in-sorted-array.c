/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int find(int* nums,int len,int target,bool a){
    int left = 0,right = len-1,result = -1;
    while(left<=right){
        int mid = (left+right)/2;
        if(nums[mid]==target){
            result =  mid;
            if(a){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        else if(nums[mid]<target){
            left = mid+1;
        }
        else{
            right = right -1;
        }
    }
    return result;
}
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    *returnSize = 2;  
    int* result = (int*)malloc(2 * sizeof(int));  

    result[0] = find(nums, numsSize, target, true);  
    result[1] = find(nums, numsSize, target, false); 

    return result;
    }