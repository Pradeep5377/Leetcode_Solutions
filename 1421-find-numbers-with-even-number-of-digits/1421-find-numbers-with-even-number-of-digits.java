class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(findDigit(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean findDigit(int i){
        int count = 0;
        while(i>0){
            i = i/10;
            count++;
        }
        return true?count%2==0:false;
    }
}