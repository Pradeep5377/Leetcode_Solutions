class Solution {
    public int[] sumZero(int n) {
        int nn = -n;
        int mid = 0;
        mid = n/2;
        int len = n;

        if(n<=1) return new int[] {0};
        int[] arr = new int[n];
        if(mid !=0){
            arr[mid] = 0;
        }

        int idx = 0;
        while(idx<mid){
            arr[idx++] = nn;
            nn++;
        }
        if(n%2!=0)idx++;

        while(idx<len){
            arr[idx++] = n;
            n--;
        }
        return arr;
    }
}