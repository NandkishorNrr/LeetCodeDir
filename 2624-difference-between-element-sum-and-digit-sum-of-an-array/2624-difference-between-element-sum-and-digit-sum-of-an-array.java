class Solution {
    public int differenceOfSum(int[] nums) {
        int digiSum = 0;
        int eleSum = 0;

        for(int n: nums){
            eleSum += n;
            while(n > 0){
                digiSum += n % 10;
                n = n / 10;
            }
        }
        return Math.abs(digiSum - eleSum);
    }
}