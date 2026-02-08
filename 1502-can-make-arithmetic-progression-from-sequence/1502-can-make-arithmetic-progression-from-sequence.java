class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int diff = arr[n-1] - arr[n-2];

        for(int i=n-2;i>0;i--){
            if(arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
}