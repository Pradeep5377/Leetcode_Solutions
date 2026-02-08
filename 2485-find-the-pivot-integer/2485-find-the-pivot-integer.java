class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;

        int leftSum=0, rightSum = 0;
        for(int i=1;i<=n;i++){
            leftSum+=i;
            rightSum = sum - leftSum + i;

            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}