class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int oddL = 1;
        int sum = 0;

        while (oddL <= len){
            for (int i = 0; i < len - (oddL) + 1; i++) {
                for (int j = i; j < oddL + i; j++) {
                    sum += arr[j];
                }
            }
            oddL += 2;
        }

        return sum;
    }
}