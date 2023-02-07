package strings;

import java.util.HashMap;

public class MaxOccurCharcter {
    public static void main(String[] args) {
        String str = "AAAAAAAgshshaaskkasjwsaks";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        char maxelement = '\0';
        int max = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                maxelement = key;
                max = map.get(key);
            }
        }
        System.out.println(maxelement);
    }

}
