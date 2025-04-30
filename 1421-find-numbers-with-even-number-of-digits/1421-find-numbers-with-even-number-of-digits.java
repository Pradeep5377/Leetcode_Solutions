class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i :nums){
            if(findDigit(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean findDigit(int n){
        return n==0?false: ((int) Math.log10(Math.abs(n)) + 1)%2==0;
    }
}