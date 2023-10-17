class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean flag;
        int count = 0;
        for(String w: words){
            flag = false;
            for(char c: w.toCharArray()){
                if(allowed.contains(String.valueOf(c)))
                    flag = true;
                else{
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }
}