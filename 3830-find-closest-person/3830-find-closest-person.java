class Solution {
    public int findClosest(int x, int y, int z) {
        int res1 = Math.abs(x-z);
        int res2 = Math.abs(y-z);
        if(res1<res2) return 1;
        else if(res2<res1) return 2;
        else return 0;
    }
}