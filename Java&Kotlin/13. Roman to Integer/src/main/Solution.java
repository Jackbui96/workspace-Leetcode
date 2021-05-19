package main;

import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {

        int sum = 0;
        HashMap<Character, Integer> mapper = new HashMap<>();
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int value = mapper.get(s.charAt(i));
            if (i + 1 != s.length()) {
                if (value >= mapper.get(s.charAt(i + 1))) {
                    sum += value;
                } else {
                    sum -= value;
                }
            } else {
                sum += value;
            }
        }

        return sum;
    }
}



