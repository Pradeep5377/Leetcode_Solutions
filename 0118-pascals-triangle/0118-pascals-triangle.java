class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();


        for(int i=0;i<numRows;i++){
            int val = 1;
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                list.add(val);
                val = val * ( (i+1) - (j+1))/ (j+1);        
            }
            result.add(list);
        }
        return result;
    }
}