class Solution {
    public int[] closestPrimes(int left, int right) {
        //Sieve of Eratosthenes Algorithm

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        boolean[] arr = new boolean[right + 1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for (int i = 2; i * i <= right; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= right; j += i) {
                    arr[j] = false;
                }
            }
        }

        int[] prime = new int[right - left + 1];
        int index = 0;
        for (int i = left; i <= right; i++) {
            if (arr[i]) {
                prime[index++] = i;
            }
        }

        if (index < 2) {
            return result;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < index; i++) {
            int diff = prime[i] - prime[i - 1];
            if (min > diff) {
                min = diff;
                result[0] = prime[i - 1];
                result[1] = prime[i];
            }
        }
        return result;
    }
}