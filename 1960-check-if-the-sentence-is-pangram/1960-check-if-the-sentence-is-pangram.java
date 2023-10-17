import java.util.Map;
import java.util.Hashtable;
class Solution {
    public boolean checkIfPangram(String sentence) {
        String a_z = "abcdefghijklmnopqrstuvwxyz";
        for(char c: a_z.toCharArray()){
            if(!sentence.contains(String.valueOf(c)))
                return false;
        }
        return true;
    }
}