class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String sqDigits = "123456789";
        List<Integer> list = new ArrayList<>();
        for(int i =2;i<=9;i++){
            for(int start = 0; start + i <= 9;start++){
                String digit = sqDigits.substring(start, start+i);
                int num = Integer.parseInt(digit);

                if(num >=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}