class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i =low;i<=high;i++){
            int digitCount = findDigit(i);
            if(digitCount%2==0){
                if(symmetric(i,digitCount)){
                    count++;
                }
            }
        }
        return count;
    }
    private int findDigit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    private boolean symmetric(int num,int count){
        int halfCount = count /2;
        int sum1 = 0;
        int sum2 = 0;
        while(halfCount-- !=0){
            sum2 += num%10;
            num = num/10;
        }

        while(num>0){
            sum1+=num%10;
            num/=10;
        }
        return sum1==sum2;
    }
}