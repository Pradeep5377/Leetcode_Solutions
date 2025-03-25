class Solution {
    public String reformat(String s) {
        int charcount = 0;
        int digitcount = 0;
        StringBuilder chr = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char c :s.toCharArray()){
            if(c>='a' && c<='z'){
                charcount++;
                chr.append(c);
            }
            else{
                digitcount++;
                digit.append(c);
            }
        }
        if(Math.abs(charcount-digitcount)>1) return "";
        boolean letterFirst = charcount >= digitcount;
        int i = 0;
        while(i<charcount && i<digitcount){
            if(letterFirst){
                ans.append(chr.charAt(i));
                ans.append(digit.charAt(i));
            }
            else{
                ans.append(digit.charAt(i));
                ans.append(chr.charAt(i));
            }
            i++;
        }
        if(charcount>i){
            ans.append(chr.charAt(i));
        }
        else if(digitcount>i){
            ans.append(digit.charAt(i));
        }
    return ans.toString();

    }
}