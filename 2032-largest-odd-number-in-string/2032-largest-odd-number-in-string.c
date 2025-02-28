char* largestOddNumber(char* num) {
    for(int i=strlen(num)-1;i>=0;i--){
        if((num[i] - 0)%2==1){
            num[i+1] = '\0';
            return num;
        }
    }
    return "";
}