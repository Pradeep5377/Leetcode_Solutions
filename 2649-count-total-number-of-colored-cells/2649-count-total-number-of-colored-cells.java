class Solution {
    public long coloredCells(int n) {
        double a  = Math.pow(n,2) + Math.pow(n-1,2);
        return (long) a;
    }
}