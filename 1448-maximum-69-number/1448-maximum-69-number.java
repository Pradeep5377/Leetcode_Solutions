class Solution {
    public int maximum69Number (int num) {
        int index = -1;

        int temp = num;
        int pos = 0;
        while(temp!=0){
            int rem = temp % 10;

            if(rem == 6) {
                index = pos; 
            }
            pos++;
            temp = temp/10;
        }
        if(index == -1) return num;

        return num + 3 *(int) Math.pow(10, index);
    }
}