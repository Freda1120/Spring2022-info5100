package ui.yinwen;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    public int getLongest(String s) {
        int i = 0, j = 0, res = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                res = Math.max(res, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }
}
