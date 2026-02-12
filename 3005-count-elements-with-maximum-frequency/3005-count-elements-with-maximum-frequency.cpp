class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        
        vector<int> freq(101,0);

        for(int i:nums){
            freq[i]++;
        }

        int max = 0;

        for(int i:nums){
            if(freq[i]>max){
                max = freq[i];
            }
        }
        int count = 0;
        for(int i: nums){
            if(freq[i] == max){
                count++;
            }
        }
        return count;
    }
};