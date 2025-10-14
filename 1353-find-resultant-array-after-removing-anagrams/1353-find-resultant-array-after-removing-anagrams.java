import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> op = new ArrayList<>();
        if (words.length == 0) return op;

        op.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> pv=kl(words[i - 1]);
            HashMap<Character, Integer> cr=kl(words[i]);
            if (!pv.equals(cr)){
                op.add(words[i]);
            }
        }
        return op;
    }

    public static HashMap<Character, Integer> kl(String s) {
        HashMap<Character, Integer> ts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ts.put(s.charAt(i), ts.getOrDefault(s.charAt(i), 0) + 1);
        }
        return ts;
    }
}
