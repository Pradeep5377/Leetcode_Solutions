int lengthOfLastWord(char* s) {
    int count =0;
    for(int i=strlen(s)-1;i>=0;i--){
        if((s[i]>='a' || s[i]>='A') && (s[i]<='z' || s[i]<='Z' )){
            count++;
            if(i>0 && s[i-1]==' ') return count;
        }
    }
    return count;
}