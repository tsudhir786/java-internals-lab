package com.tirumareddy.javalab.qa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String input = "swwiiss";
        firstNonRepeatingCharacter(input);
    }

    public static void firstNonRepeatingCharacter(String input) {

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {

            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(
                        "First non-repeating character: " + entry.getKey()
                );
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
