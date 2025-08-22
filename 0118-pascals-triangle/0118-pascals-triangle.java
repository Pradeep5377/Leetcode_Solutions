class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // result.add(firstrow);

        for(int i=1;i<=numRows;i++){
        //List<Integer> firstrow = new ArrayList<>();
            List<Integer> row = new ArrayList<>();
            int val =  1;
            for(int j=1;j<=i;j++){
                row.add(val);
                val  = val * (i - j) / (j);
            }
            result.add(row);
        }
        return result;
    }
}