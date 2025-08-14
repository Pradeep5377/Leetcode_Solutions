class Solution {
    public String largestGoodInteger(String num) {

        int left = 0,right = 1;
        char max = 0;
        String s ="";
        int count = 1;
        while(right < num.length()){
            
            if(num.charAt(left) == num.charAt(right)){
                count++;
                if(count == 3){
                    if(num.charAt(left) > max){
                        max = num.charAt(left);
                    }
                }
            }
            else{
                count=1;
            }
            left++;
            right++;
        }
        if(max == 0) return "";
        for(int i=0;i<3;i++){
            s+= max;
        }
        return s;
    }
}