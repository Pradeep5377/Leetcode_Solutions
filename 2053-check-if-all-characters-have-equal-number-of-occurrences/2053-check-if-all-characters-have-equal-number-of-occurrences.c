bool areOccurrencesEqual(char* s) {
    int freq[26];
    for(int i =0;s[i]!='\0';i++){
        freq[s[i]-'a']++;
    }  
    int len = -1;
    for(int i=0;i<26;i++){
        if(freq[i]>0 ){
            len = freq[i];
            break;
        }
    }
    for(int i =0;i<26;i++){
        if(freq[i]!=len && freq[i]!=0){
            return false;
        }
    }
    return true;
}