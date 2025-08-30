class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>();
        result.add(1);

      
        rowIndex++;
        long ans = 1;
        for(int i=1;i<rowIndex;i++){
            ans = ans * (rowIndex-i) / i;
            result.add((int) ans);
        }
        return result;
    }
}