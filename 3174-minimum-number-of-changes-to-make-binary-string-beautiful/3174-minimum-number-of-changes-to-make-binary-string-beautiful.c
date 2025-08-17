int minChanges(char* s) {
    int count = 0;

    for(int i=0;i<strlen(s)-1;i+=2){
        count += s[i] ^ s[i+1];
    }

    return count;
}