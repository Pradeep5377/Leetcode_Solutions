class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<k+i;j++){
                if(j<s.length()){
                    sb.append(s.charAt(j));
                }
                else{
                    sb.append(fill);
                }
            }
            list.add(sb.toString());
        }
        return list.toArray(new String[0]);
    }
}