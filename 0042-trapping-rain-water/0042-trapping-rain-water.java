class Solution {
    public int trap(int[] height) {
        Stack <Integer> rightmax = new Stack<>();
        rightmax.push(height[height.length-1]);
        for(int i=height.length-2;i>=1;i--){
            rightmax.push(Math.max(rightmax.peek(),height[i]));
        }

        int leftmax = height[0];
        int totalWater = 0;
        for(int i=1;i<height.length-1;i++){

            int value = Math.min(leftmax,rightmax.peek());
            int temp = value - height[i];
            totalWater +=Math.max(0,temp);
            leftmax = Math.max(leftmax,height[i]);
            rightmax.pop();
        }
        return totalWater;
    }
}