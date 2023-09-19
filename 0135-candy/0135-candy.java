class Solution {
     public int candy(int[] ratings) {
        int len = ratings.length;
        int[] cnds = new int[len];
        Arrays.fill(cnds, 1);
        int cs = 0;
         for(int i = 1; i < len; i++){
                if(ratings[i] > ratings[i - 1])
                    cnds[i] = cnds[i - 1] + 1;
            }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) 
                cnds[i] = Math.max(cnds[i], cnds[i + 1] + 1);
        }
        
        for(int c: cnds){
            cs += c;
        }
        return cs;
    }
}