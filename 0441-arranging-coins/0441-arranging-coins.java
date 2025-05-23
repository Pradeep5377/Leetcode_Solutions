class Solution {
    public int arrangeCoins(int n) {
        long left = 0,right = n;

        while(left<=right){
            long mid = (left+right)/2;
            long value =  (mid *(mid+1))/2;

            if(value==n) return (int)mid;
            else if(value<n) left = mid+1;
            else right = mid-1;
        }
        return (int) right;
    }
}