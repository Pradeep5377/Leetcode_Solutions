class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int firstValue = -1;
        boolean first = true;
        for(int val : map.values()){
            if(first){
                firstValue = val;
                first = false;
            }
            else if(val!=firstValue){
                return false;
            }
        }
        return true;
    }
}