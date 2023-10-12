class Solution {
    public String reverseWords(String s) {
        char[] sA = s.toCharArray();
        s = "";
        StringBuilder word = new StringBuilder();

        for(char ch: sA){
            if(ch == ' '){
                word.reverse();
                s = s + word.toString() + " ";
                word.setLength(0);
                continue;
            }
            word.append(ch);
        }
        s += word.reverse().toString();
        return s;
    }
}