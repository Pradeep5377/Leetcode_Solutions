int findLucky(int* arr, int arrSize) {
    int freq[501]={0};
    int index = 0;
    for(int i=0;i<arrSize;i++){
        freq[arr[i]]++;
        index = (arr[i]>index) ? arr[i] : index;
    }
    for(int i=index;i>=1;i--){
        if(freq[i]== i){
            return i;
        }
    }
    return -1;
}