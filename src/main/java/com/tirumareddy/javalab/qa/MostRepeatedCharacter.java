package com.tirumareddy.javalab.qa;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static void main(String[] args) {

        String input = "seleniumautomation";
        System.out.println(findMostRepeatedCharacter(input));
    }

    public static char findMostRepeatedCharacter(String input) {

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        char mostRepeatedChar = '\0';

        char[] charArray = input.toCharArray();

        for (char c : charArray) {

            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

            if (entry.getValue() > maxCount) {

                maxCount = entry.getValue();
                mostRepeatedChar = entry.getKey();

            }
        }

        return mostRepeatedChar;

    }
}