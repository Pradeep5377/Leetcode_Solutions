class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i :nums){
            if(i == 0) zero++;
            else if(i == 1) one++;
            else two++;
        }

        int index = 0;
        for(int i=0;i<zero;i++){
            nums[index++] = 0;
        }
        for(int i=0;i<one;i++){
            nums[index++] = 1;
        }
        for(int i=0;i<two;i++){
            nums[index++] = 2;
        }
    }
}