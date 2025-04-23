class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum = 0;
            int num = i;
            while(num!=0){
                sum +=num%10;
                num = num/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max = Integer.MIN_VALUE;

        for(int i:map.values()){
            if(i>max){
                max = i;
            }
        }
        int count = 0;
        for(int i:map.values()){
            if(i==max){
                count++;
            }
        }
        return count;
    }
}