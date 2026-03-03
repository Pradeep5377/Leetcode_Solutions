class Solution {
    static String invert(String str){
        StringBuilder sb  = new StringBuilder(str);
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                sb.setCharAt(i,'1');
            }
            else{
                sb.setCharAt(i,'0');
            }
        }
        return sb.toString();
    }
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        String[] strArray = new String[n];
        strArray[0] = "0";
        for(int i=1;i<n;i++){
            String x = sb.toString();
            String inv = invert(x);
            String rev = reverse(inv);
            // sb.x;
            sb.append("1");
            sb.append(rev);
        }
        return sb.charAt(k-1);
    }
}