class Solution {
    public String convert(String s, int rowNum) {
        if (rowNum == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowNum; i++) {
            int lastPos = -1;
            for (int j = 0; true; j++) {
                int pos = -1;
                if (i == 0) {
                    pos = j * 2 * (rowNum - 1);
                } else if (i == rowNum - 1) {
                    pos = (rowNum - 1) + j * 2 * (rowNum - 1);
                } else {
                    if (j == 0) {
                        pos = i;
                        lastPos = pos;
                    } else if (j % 2 == 1) {
                        pos = lastPos + 2 * (rowNum - 1 - i);
                        lastPos = pos;
                    } else {
                        pos = lastPos + 2 * i;
                        lastPos = pos;
                    }
                }
                if (
                    pos >= s.length()
                ) {
                    break;
                }
                sb.append(s.charAt(pos));
            } 
        }
        return sb.toString();
    }
}