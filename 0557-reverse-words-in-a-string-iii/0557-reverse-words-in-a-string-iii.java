class Solution {
    public String reverseWords(String s) {
        StringBuilder ns = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                word.reverse();
                ns.append(word).append(" ");
                word.setLength(0);
                continue;
            }
            word.append(ch);
        }
        word.reverse();
        ns.append(word);
        return ns.toString();
    }
}