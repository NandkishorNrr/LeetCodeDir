class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];

        int pix = 0;
        int line = 1;

        for (char ch: s.toCharArray()) {
            pix += widths[ch - 'a'];

            if (pix > 100){
                line++;
                pix = 0;
                pix += widths[ch - 'a'];
            }
        }
        res[0] = line;
        res[1] = pix;
        return res;
    }
}