bool isSorted(int* nums , int len){
        for(int i=1;i<len;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }

int minimumPairRemoval(int* nums, int numsSize) {
        int result = 0;
        int len = numsSize;

        while(len>0 && isSorted(nums,len)== false){
            int i = 1;
            int j=0,indextoremove=0; 
            int minSum = INT_MAX;
            while(i<len){
                int currSum = nums[i] +nums[i-1];
                if(currSum<minSum){
                    minSum = currSum;
                    j = i-1;
                    indextoremove = i; // We cant directly remove in "C" so we are  shifting it to the last position.
                } 
                i++;
            }
            nums[j] = minSum;

            while(indextoremove<(len-1)){
                nums[indextoremove] = nums[indextoremove+1];
                indextoremove++;
            }

            len--;
            result++;
        }
        return result;
    }