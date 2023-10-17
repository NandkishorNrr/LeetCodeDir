import java.util.Hashtable;
class Solution {
    public String decodeMessage(String key, String message) {
        char a = 'a';
        Hashtable<Character, Character> keys = new Hashtable<>();
        StringBuilder sms = new StringBuilder();

        for (char k: key.toCharArray()) {
            if (k == ' ' || keys.containsKey(k))
                continue;
            // System.out.println("key " + k + " val " + a);
            keys.put(k, a++);
        }

        System.out.println(keys.toString());
        for (char ch: message.toCharArray()) {
            if (ch == ' ')
                sms.append(" ");
            else
                sms.append(keys.get(ch));
        }
        return sms.toString();
    }
}