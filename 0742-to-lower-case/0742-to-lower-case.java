class Solution {
    public String toLowerCase(String s) {
        String a = "";
        for(char ch: s.toCharArray()){
            if('A' <= ch && ch <= 'Z')
                ch = (char)(ch + ('a' - 'A'));
            a += ch; 
        }
        return a;
    }
}