class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         StringBuilder word = new StringBuilder();
        HashSet<String> codeWord = new HashSet<>();
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String w: words) {
            for (char ch: w.toCharArray()) {
                word.append(code[ch - 'a']);
            }
            codeWord.add(word.toString());
            word.setLength(0);
        }

        return codeWord.size();
    }
}