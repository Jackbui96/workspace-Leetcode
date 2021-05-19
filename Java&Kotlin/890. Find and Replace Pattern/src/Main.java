import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /**
     * If say, the first letter of the pattern is "a", and the first letter of the word is "x",
     * then in the permutation, "a" must map to "x".
     *
     * We can write this bijection using two maps: a forward map m1 and a backwards map m2.
     *
     * m1:"a"→"x"
     * m2:"x"→"a"
     *
     * Then, if there is a contradiction later, we can catch it via one of the two maps.
     * For example, if the (word, pattern) is ("aa", "xy"), we will catch the mistake in m1(namely, m1("a")="x"="y").
     * Similarly, with (word, pattern) = ("ab", "xx"), we will catch the mistake in m2.
     *
     * Source: LeetCode Challenge
     */

    public static void main(String[] args) {
        String[] arr = {"abc","deq","mee","aqq","dkd","ccc"};
        System.out.println(findAndReplacePattern(arr, "abb"));
    }


    private static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word: words) {
            if (match(word, pattern))
                ans.add(word);
        }
        return ans;
    }

    private static boolean match(String word, String pattern) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if(!m1.containsKey(w)) m1.put(w, p);
            if(!m2.containsKey(p)) m2.put(p, w);
            if(m1.get(w) != p || m2.get(p) != w)
                return false;
        }
        return true;
    }

}
