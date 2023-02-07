package strings;

import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcbdafdc";
        String longestSubstring = "";
        Integer maxlength = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
                if (maxlength < map.size()) {
                    maxlength = map.size();
                    longestSubstring = map.keySet().toString();
                } else {
                    i = map.get(str.charAt(i));
                    map.clear();
                }
            }
        }
        System.out.println("String is " + longestSubstring);
        System.out.println("Length is " + maxlength);
    }
}
