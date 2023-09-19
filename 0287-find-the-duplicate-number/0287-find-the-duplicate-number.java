class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> u = new HashSet<>();
        for(int n: nums){
            if(u.contains(n))
                return n;
            u.add(n);
        }
        return -1;
    }
}