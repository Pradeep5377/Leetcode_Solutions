class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(String word : words){
            for(char a : word.toCharArray()){
                if(a==x ){
                    list.add(index);
                    break;
                }
            }
            index++;
        }
        return list;
    }
}