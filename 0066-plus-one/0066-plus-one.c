/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    int* result = (int*)calloc(sizeof(int),(digitsSize + 1));
    for (int i = digitsSize - 1; i >= 0; i--) {
        if (digits[i]<9) {
            digits[i] = digits[i] + 1;
            *returnSize = digitsSize;
            return digits;
        }
        digits[i] = 0;
    }
    result[0] = 1;
    *returnSize = digitsSize + 1;
    return result;
}