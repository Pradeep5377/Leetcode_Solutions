bool findDigit(int n){
    return n==0?false:(int)(log10(abs(n))+1)%2==0;
}

int findNumbers(int* nums, int numsSize) {
    int count = 0;
    for(int i=0;i<numsSize;i++){
        if(findDigit(nums[i])){
            count++;
        }
    }
    return count;
}