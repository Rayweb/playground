package snipets.codewar.isogram;

import java.util.HashSet;
import java.util.Set;
public class IsogramRay extends Isogram {
    @Override
    public  boolean isIsogram(String word) {
        boolean result = true;
        Set<Character> chars = new HashSet<Character>();
        String lowerWord = word.toLowerCase();
        for (int i = 0; i < lowerWord.length(); i++) {
            if (chars.contains(lowerWord.charAt(i))) {
                result = false;
            } else {
                chars.add(word.charAt(i));
            }
        }
        return result;
    }
}
